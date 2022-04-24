package Bonus;


import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points= new ArrayList<>();

    public PolyLine(){

    }

    public PolyLine(List<Point> points){
        this.points = points;
    }

    public void appendPoint(Point point){
        points.add(point);
    }

    public void appendPoint(int x,int y){
        Point point =new Point(x,y);
        points.add(point);
    }
    public double getLength(){
        double length=0;
       for (int i=0;i<points.size()-1;i++){
           double distance = Math.sqrt((points.get(i).getX()-points.get(i+1).getX())*
                                       (points.get(i).getX()-points.get(i+1).getX())+
                                       (points.get(i).getY()-points.get(i+1).getY())*
                                       (points.get(i).getY()-points.get(i+1).getY()));
           length+=distance;
       }
       return  length;
    }
}
