public class Book {
    private String name; // get -> books[0] = "A Brief History Of Time" , books[1] = "The Grand Design"
    private int stock; // set values for array, for instance , if(id == 1) {  books[0], stock //stock value is random  }
    private int id;

    public Book(){
    }

    public Book(String name, int stock, int id) {
        this.name = name;
        this.stock = stock;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
