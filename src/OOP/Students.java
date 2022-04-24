package OOP;

public class Students {
    private String name;
    private int age;
    private String gender;
    private double gpa;

    public Students(String name, int age, String gender, double gpa) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.gpa = gpa;
    }

    public Students() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void display()
    {
        System.out.println("Student: name"+this.name+"\tage:"+this.age+"\tgender:"+this.gender+"\tGpa:"+this.gpa);
    }
}
