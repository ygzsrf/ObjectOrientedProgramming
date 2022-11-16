import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Hotel {
    private String hotelName;
    private String openAddress;
    private List<Apartment> apartmentList;
    private List<Booking> bookingList;

    public Hotel() {

    }

    public Hotel(String hotelName, String openAddress, List<Apartment> apartmentList, List<Booking> bookingList) {
        this.hotelName = hotelName;
        this.openAddress = openAddress;
        this.apartmentList = apartmentList;
        this.bookingList = bookingList;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getOpenAddress() {
        return openAddress;
    }

    public void setOpenAddress(String openAddress) {
        this.openAddress = openAddress;
    }

    public List<Apartment> getApartmentList() {
        return apartmentList;
    }

    public void setApartmentList(List<Apartment> apartmentList) {
        this.apartmentList = apartmentList;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }


    //      Methods starts from here






    //      addNewApartment(int id, int floorNumber, int area, String type)

    public Apartment addNewApartment(int id, int floorNumber, int area, String type) {
        Apartment apartment=new Apartment(id,floorNumber,area,type);
        apartmentList.add(apartment);

        return apartment;
    }



    //      Adding new Booking with apartment, starting date, ending date
    public Booking addNewBooking(Apartment apartment, Date startDate, Date endDate) {
        int id=bookingList.size()+1;
        boolean cancelled = false;

        Booking bookingSys=new Booking(id, apartment, startDate, endDate,  cancelled);
        bookingList.add(bookingSys);

        return bookingSys;
    }




    //      To cancel any booking by its name
    public Boolean cancelBooking(Booking booking){
        if(booking==null) {
            return false;
        }
        return booking.isCancelled();
    }
}
