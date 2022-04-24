package Bonus;

public class Author {
    private String name;
    private String email;

    public Author(String name,String email){
        this.email = email;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public  void setEmnail(String email){
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }
}
