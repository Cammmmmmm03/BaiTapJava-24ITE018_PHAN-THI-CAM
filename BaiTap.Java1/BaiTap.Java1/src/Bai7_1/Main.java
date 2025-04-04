package Bai7_1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Alice");
        customer1.setMember(true);
        customer1.setMemberType("Gold");

        Visit visit1 = new Visit(customer1, new Date());
        visit1.setServiceExpense(100);
        visit1.setProductExpense(50);

        System.out.println(visit1);

        Customer customer2 = new Customer("Bob");
        customer2.setMember(false);

        Visit visit2 = new Visit(customer2, new Date());
        visit2.setServiceExpense(200);
        visit2.setProductExpense(100);

        System.out.println(visit2);
    }
}

