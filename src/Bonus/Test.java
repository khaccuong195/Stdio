package Bonus;

public class Test {
    public static void main(String[] agrs){
        Author author = new Author("net","net@gmail.com");
        Book book = new Book("Lac",100,author);
        book.display();
        PolyLine polyLine = new PolyLine();
        polyLine.appendPoint(4,5);
        polyLine.appendPoint(6,7);
        polyLine.appendPoint(new Point(8,9));
        polyLine.appendPoint(new Point(8,9));
        System.out.println("length:"+polyLine.getLength());


    }
}
