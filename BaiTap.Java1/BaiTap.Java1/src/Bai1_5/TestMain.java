package Bai1_5;

public class TestMain{
    public static void main(String[] args) {
        InvoiceItem i1= new InvoiceItem(" A101", "Pen Red", 888, 0.08);
        System.out.println(i1);
        i1.setQty(999);
        i1.setUnitPrice(0.99);
        System.out.println(i1);
        System.out.println("id is:"+ i1.getId());
        System.out.println("desc is:"+ i1.getDesc());
        System.out.println("qty is:"+ i1.getQty());
        System.out.println("unitPrice is:"+ i1.getUnitPrice());
        System.out.println("the total is:"+i1.getTotal());
    }
}
