package Bai6_6;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("WOOF");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("WOOOOF");
    }

    public void greets(BigDog another) {
        System.out.println("WOOOOOOF");
    }
}

