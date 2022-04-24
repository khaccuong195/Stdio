package OOP;

public class TestClass {
    public static void main(String [] agrs)
    {
      Students students = new Students("net",19,"nam",4.0);
      students.display();
      Circle circle = new Circle(3);
      circle.display();
      Point point = new Point(2,3);
      Point point1 = new Point(5,6);
      point.display();
      point1.display();
      System.out.println("distance ="+point.distance(point1));
      System.out.println("distance ="+point.distance(8,9));
      Account account = new Account(125,"net",1985000);
      account.display();
      account.deposit(50000);
      account.display();
      account.withdraw(60000);
      account.display();

    }
}
