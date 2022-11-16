import java.util.Date;

public class Booking {
    private int id, apartment; // apartment number
    private Date startDate, endDate;
    private boolean cancelled;

    public Booking(){

    }

    public Booking(int id, int apartment, Date startDate, Date endDate, boolean cancelled) {
        this.id = id;
        this.apartment = apartment;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cancelled = cancelled;
    }

    public Booking(int id, Apartment apartment, Date startDate, Date endDate, boolean cancelled) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
