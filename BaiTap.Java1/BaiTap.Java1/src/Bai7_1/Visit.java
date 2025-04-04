package Bai7_1;

import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
        this.serviceExpense = 0.0;
        this.productExpense = 0.0;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        double serviceDiscount = serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double productDiscount = productExpense * DiscountRate.getProductDiscountRate();
        return (serviceExpense - serviceDiscount) + (productExpense - productDiscount);
    }

    @Override
    public String toString() {
        return "Visit[customer=" + customer + ", date=" + date +
                ", serviceExpense=" + serviceExpense + ", productExpense=" + productExpense +
                ", totalExpense=" + getTotalExpense() + "]";
    }
}

