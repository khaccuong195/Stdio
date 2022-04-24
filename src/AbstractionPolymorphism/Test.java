package AbstractionPolymorphism;

public class Test {
    public static void main(String[] agrs){
        Employee employee = new Employee("net","80 hanoi",500000);
        Customer customer = new Customer("zet","81 hanoi",800000);
        employee.display();
        customer.display();
    }
}
