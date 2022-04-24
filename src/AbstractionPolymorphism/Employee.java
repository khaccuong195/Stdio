package AbstractionPolymorphism;

public class Employee extends Person {
    private int Salary;

    public Employee(String name, String address,int salary) {
        super(name, address);
        this.Salary=salary;
    }


    @Override
    void display() {
     System.out.println("Employee Name:"+this.getName());
     System.out.println("Employee Address:"+this.getAddress());
     System.out.println("Employee Salary:"+this.Salary);



    }
}
