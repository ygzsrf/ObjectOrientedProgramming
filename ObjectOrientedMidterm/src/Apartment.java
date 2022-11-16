public class Apartment {
    private int id, floorNumber;
    private int area; // area=n*n
    private String type; // family, student etc.

    public Apartment(){

    }

    public Apartment(int id, int floorNumber, int area, String type) {
        this.id = id;
        this.floorNumber = floorNumber;
        this.area = area;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getArea() {
        return area * area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
