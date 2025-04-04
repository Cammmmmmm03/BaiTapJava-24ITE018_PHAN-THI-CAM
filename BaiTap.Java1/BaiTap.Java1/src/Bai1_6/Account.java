package Bai1_6;

public class Account {
    private String id;
    private String name;
    private int balance;
    public Account(String s, String string){
        this.balance=0;
    }
    public Account( String id, String name, int balance){
        this.id= id;
        this.name= name;
        this.balance= balance;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int Credit( int amount){
        balance+=amount;
        return balance;
    }
    public int debit(int amount){
        if(amount<= balance){
            balance-=amount;}
        else{
            System.out.println("amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(Account another, int amount){
        if(amount<=balance){
            this.debit(amount);
            another.Credit(amount);}
        else{
            System.out.println("amount exceeded balance");
        }
        return balance;
    }
    @Override
    public String toString() {
        return " Account[id="+id+", name="+name+", balance="+balance+" ]";
    }
}

