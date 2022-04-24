package AbstractionPolymorphism2;

public class Test {
    public static void main(String[] agrs){
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("net",20000,4);
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("zet",40000);
        System.out.println("PartTimeEmployee :"+partTimeEmployee.calculateSalary());
        System.out.println("FullTimeEmployee :"+fullTimeEmployee.calculateSalary());
    }
}
