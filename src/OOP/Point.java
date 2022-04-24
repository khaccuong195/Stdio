package OOP;

public class Point {

    private double x;
    private double y;

    public Point(){

    }

    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    public void setX(double x){
        this.x=x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setXY(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double distance( double x,double y){
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }

    public double distance(Point another){
         return distance(another.getX(),another.getY());
    }

    public void display(){
        System.out.println("Point: X="+this.x+"\tY="+this.y);
    }
}
