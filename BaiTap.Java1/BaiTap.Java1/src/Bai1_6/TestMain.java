package Bai1_6;

public class TestMain{
    public static void main(String[] args) {
        Account a1= new Account(" A03", " Cam", 18);
        System.out.println(a1);
        Account a2= new Account(" A013", " Chuott");
        System.out.println(a2);
        System.out.println("id is:"+a1.getId());
        System.out.println("name is:"+a1.getName());
        System.out.println(" balance is:"+a1.getBalance());

        a1.Credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);
        System.out.println(a1);
        a1.transferTo(a2, 100);
        System.out.println(a1);
        System.out.println(a2);
    }
}
