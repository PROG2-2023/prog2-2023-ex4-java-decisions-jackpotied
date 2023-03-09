package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;


public class Main
{
    public static void main( String[] args )
    {
        String date1="2015-05-05";
        String date2="2023-01-23";
        LocalDate dat1=LocalDate.parse(date1);
        LocalDate dat2=LocalDate.parse(date2);
        FlightBooking fb=new FlightBooking("Patchouli",dat1,dat2,0,1);

        System.out.println(fb);


    }

}
