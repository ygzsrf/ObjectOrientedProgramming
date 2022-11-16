import java.util.Scanner;
import java.util.Date;

public class TestHotel {

    public static void main(String[] args){

        Apartment aptClass = new Apartment(); // new obj from apartment class
        Booking bookingClass = new Booking(); // new obj from booking class
        Hotel hotelClass = new Hotel(); // new obj from hotel class

        // new apartment int id, int floorNumber, int area, String type
        Apartment firstApt = hotelClass.addNewApartment(1, 1, 15, "Studio"); // apt 1
        Apartment secApt = hotelClass.addNewApartment(2, 1, 13, "Studio"); // apt 2
        Apartment thirdApt = hotelClass.addNewApartment(3, 2, 75, "Triplex"); // apt 3
        Apartment fourthApt = hotelClass.addNewApartment(4, 2, 59, "Triplex"); // apt 4
        Apartment fifthApt =  hotelClass.addNewApartment(5, 3, 95, "Triplex"); // apt 5
        Apartment sixthApt =  hotelClass.addNewApartment(6, 3, 126, "Triplex"); // apt 6



        // all booking section

        //starts from now, for the next 2 days
        Booking firstBook= hotelClass.addNewBooking(firstApt,new Date(2022, 11, 15),new Date(2022, 11, 17));

        //booking for this weekend
        Booking secBook= hotelClass.addNewBooking(secApt,new Date(2022, 11, 19),new Date(2022, 11, 21));

        //booking starts from first of december for 15 days
        Booking thirdBook= hotelClass.addNewBooking(thirdApt,new Date(2022, 12, 15),new Date(2022, 12, 30));

        //booking for today
        Booking fourthBook= hotelClass.addNewBooking(fourthApt,new Date(2022, 11, 15),new Date(2022, 11, 16));

        //booking for tommorrow
        Booking fifthBook= hotelClass.addNewBooking(fifthApt,new Date(2022, 11, 19),new Date(2022, 11, 21));

        //booking for this weekend
        Booking sixthBook= hotelClass.addNewBooking(sixthApt,new Date(2022, 11, 19),new Date(2022, 11, 21));




        // for the last, cancelling the booking four Apartment 2 (secApt)
        hotelClass.cancelBooking(secBook);
    }

}
