package Bai2_1;

public class TestMain{
    public static void main(String[] args) {
        Author a1= new Author("cammm", "campt24ite@vku.com",'f');
        System.out.println(a1);
        a1.setEmail("phanthicam2006@gmail.com");
        System.out.println("name is:"+a1.getName());
        System.out.println("email is:"+a1.getEmail());
        System.out.println("gender is:"+a1.getGender());

        Book b1= new Book("java for cam",a1,19.95, 99);
        System.out.println(b1);
        b1.setPrice(29.95);
        b1.setQty(28);
        System.out.println("name is:"+ b1.getName());
        System.out.println("pice is:"+b1.getPrice());
        System.out.println(" qty is:"+ b1.getQty());
        System.out.println("author is:"+ b1.getAuthor());
        System.out.println("author's name is:"+b1.getAuthor().getName());
        System.out.println("author's email is:"+b1.getAuthor().getEmail());
        Book b2 = new Book("more Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(b2);
    }
}
