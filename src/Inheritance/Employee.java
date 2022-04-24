package Inheritance;

public class Employee {
    private  String name;
    private  int salary;

    public Employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }
    public void display(){
        System.out.print("Employee name:"+this.name+"\tsalary:"+this.salary+"}");
    }
}
