import service.UserService;
import util.XMLUtils;
import model.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        UserService service = new UserService();

        while (true) {
            System.out.println("1. Đăng ký");
            System.out.println("2. Đăng nhập");
            System.out.println("3. Xuất XML");
            System.out.println("4. Nhập XML");
            System.out.println("0. Thoát");

            int choice = sc.nextInt(); sc.nextLine();
            if (choice == 1) {
                System.out.print("Username: ");
                String user = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Password: ");
                String pass = sc.nextLine();
                if (service.register(user, email, pass)) {
                    System.out.println("✅ Đăng ký thành công!");
                } else {
                    System.out.println("❌ Tên người dùng đã tồn tại!");
                }
            } else if (choice == 2) {
                System.out.print("Username: ");
                String user = sc.nextLine();
                System.out.print("Password: ");
                String pass = sc.nextLine();
                if (service.login(user, pass)) {
                    System.out.println("✅ Đăng nhập thành công!");
                } else {
                    System.out.println("❌ Sai thông tin!");
                }
            } else if (choice == 3) {
                XMLUtils.exportUsers(service.getAllUsers(), "users.xml");
                System.out.println("✅ Đã xuất file users.xml");
            } else if (choice == 4) {
                service.getAllUsers().addAll(XMLUtils.importUsers("users.xml"));
                System.out.println("✅ Đã đọc file users.xml");
            } else break;
        }

        sc.close();
    }
}
