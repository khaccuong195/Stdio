package OOP;

public class Circle {
    private double radius;
    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return radius*radius*3.14;
    }
    public double getCircumference(){
        return radius*2*3.14;
    }
    public void display(){
        System.out.println("Circle: radius="+this.radius+"\tArea="+this.getArea()+"\tCircumference="+this.getCircumference());
    }
}
