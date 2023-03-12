package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;


public class Main
{
    public static void main( String[] args )
    {
        String sdepart = "2023-03-04";
        LocalDate departureDate = LocalDate.parse(sdepart);

        String sreturn = "2023-03-05";
        LocalDate returnDate = LocalDate.parse(sreturn);
        FlightBooking ll=new FlightBooking("patchouli",departureDate,returnDate,2,3);

    }

}
