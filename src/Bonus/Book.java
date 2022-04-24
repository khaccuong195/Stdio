package Bonus;

public class Book {
    private String name;
    private double price;
    private Author author;

    public Book(String name,double price,Author author){
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public void setName(String name){
        this.name = name;
    }

    public  void setPrice(double price){
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public Author getAuthor(){
        return author;
    }

    public void display(){
        System.out.println("BOOK:\tName: "+this.name+"\tPrice: "+this.price);
        System.out.println("Author:\tName: "+author.getName()+"\tEmail: "+author.getEmail());
    }
}
