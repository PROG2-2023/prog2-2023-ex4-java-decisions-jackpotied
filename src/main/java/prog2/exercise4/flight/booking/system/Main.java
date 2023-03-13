package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;


public class Main
{
    public static void main( String[] args )
    {

        FlightBooking fb = new FlightBooking(null, null, null, 0, 0);

        FlightBooking.TripSource source = FlightBooking.TripSource.NANJING;
        FlightBooking.TripDestination destination = FlightBooking.TripDestination.BEIJING;

        FlightBooking.TripType type = FlightBooking.TripType.ONE_WAY;

        FlightBooking.BookingClass bookClass = FlightBooking.BookingClass.FIRST;

        fb.setTripSource("1");
        fb.setTripDestination("1", "2");

        fb.setTripType("1");
        fb.setBookingClass("1");

        String expectedTicketNumber = "11FASDFDOM";

        String expectedSubstring1 = expectedTicketNumber.substring(0,2);
        System.out.println(expectedSubstring1);
        String expectedSubstring2 = expectedTicketNumber.substring(7, 9);
        System.out.println(expectedSubstring2);

        String ticketNumber = fb.getTicketNumber();

        String returnedSubstring1 = ticketNumber.substring(0, 2);
        System.out.println(returnedSubstring1);
        String returnedSubstring2 = ticketNumber.substring(7, 9);
        System.out.println(returnedSubstring2);
        System.out.println(ticketNumber);
    }

}
