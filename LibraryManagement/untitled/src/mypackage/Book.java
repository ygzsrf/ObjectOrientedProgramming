package mypackage;

public class Book {
    private int id;
    private String name;
    private int stock;

    Book(){
        id = -1;
        name = "";
        stock = -1;
    }

    Book(int id, String nameS, int stock){
        this.id = id;
        name = nameS;
        this.stock = stock;
    }

    public int getID(){
        return this.id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
