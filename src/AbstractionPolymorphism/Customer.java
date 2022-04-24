package AbstractionPolymorphism;

public class Customer extends Person {

    private int balance;

    public Customer(String name, String address,int balance) {
        super(name, address);
        this.balance = balance;
    }

    @Override
    void display() {
        System.out.println("Customer Name:"+this.getName());
        System.out.println("Customer Address:"+this.getAddress());
        System.out.println("Customer Balance:"+this.balance);
    }
}
