package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class FlightBooking {
    private final String flightCompany = "Flights-of-Fancy";
    private String flightID;
    private String passengerFullName;
    private final String tripSource = "NANJING";
    private final String sourceAirport = "NANJING LUKOU INTERNATIONAL AIRPORT";
    private final String tripDestination = "OULU";
    private final String destinationAirport = "OULU AIRPORT";
    private LocalDate departureDate;
    private LocalDate returnDate;
    private int childPassengers;
    private int adultPassengers;
    private int totalPassengers;
    private double departingTicketPrice;
    private double returnTicketPrice;
    private double totalTicketPrice;
    private String ticketNumber;
    private  boolean dateerror;
    boolean natively;

    public FlightBooking(String passengerFullName, LocalDate departureDate, LocalDate returnDate,
                         int childPassengers, int adultPassengers) {
        this.passengerFullName = passengerFullName;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.childPassengers = childPassengers;
        this.adultPassengers = adultPassengers;
        this.totalPassengers = adultPassengers + childPassengers;
        this.departingTicketPrice = 0.50;
        this.returnTicketPrice = 0.50;
        this.totalTicketPrice = 1.00;
    }

    public String toString() {

        if (dateerror=false) {
            return "Dear" + passengerFullName + ". Thank you for booking your flight with " + flightCompany +
                    ". Following are the details of your booking and the trip:\n\n" +
                    "Ticket Number: " + getTicketNumber() +
                    "\nFrom " + getTripSource() + "to " + getTripDestination() +
                    "\nDate of departure: " + departureDate.toString() +
                    "\nDate of return: " + returnDate.toString() +
                    "\nTotal passengers: " + totalPassengers +
                    "\nTotal ticket price in Euros: " + getTotalTicketPrice();
        }
        else {
            return "Dear" + passengerFullName + ". Thank you for booking your flight with " + flightCompany +
                    ". Following are the details of your booking and the trip:\n" +
                    "Ticket Number: " + getTicketNumber() +
                    "\nFrom " + getTripSource() + "to " + getTripDestination() +
                    "\nDate of departure: " + departureDate.toString() +
                    "\nDate of return: " + returnDate.toString() +
                    "\nTotal passengers: " + totalPassengers +
                    "\nTotal ticket price in Euros: " + getTotalTicketPrice()+"\n\nIMPORTANT NOTICE: As per our policy, the return date was changed because it was less than two days apart from your departure date.";
        }
    }

    enum TripType{
        ONE_WAY,RETURN
    }
    enum BookingClass{
        FIRST,BUSINESS,ECONOMY
    }
    enum TripSource{
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS
    }
    enum 	TripDestination{
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS
    }
    enum 	SourceAirport{
        NanjingLukouInternationalAirport, BeijingCapitalInternationalAirport,ShanghaiPudongInternationalAirport,OuluAirport, HelsinkiAirport,ParisCharlesdeGaulleAirport
    }
    enum DestinationAirport{
        NanjingLukouInternationalAirport, BeijingCapitalInternationalAirport,ShanghaiPudongInternationalAirport,OuluAirport, HelsinkiAirport,ParisCharlesdeGaulleAirport

    }
    FlightBooking.TripSource bk;
    FlightBooking.SourceAirport be;
public void setTripSource(String choicee){

    switch (choicee){
        case "1":bk= TripSource.NANJING;break;
        case"2":bk=TripSource.BEIJING;break;

        case"3":bk=TripSource.OULU;break;
        case"4":bk=TripSource.HELSINKI;break;



    }
    switch(choicee){
        case"1":be=SourceAirport.NanjingLukouInternationalAirport;break;
        case"2":be=SourceAirport.BeijingCapitalInternationalAirport;break;
        case"3":be=SourceAirport.OuluAirport;break;
        case"4":be=SourceAirport.HelsinkiAirport;break;

    }
    }
    public TripSource getTripSource(){return  bk;}
    public void setTripDestination(String s,String b) {
    if(s!=b) {
        int source = Integer.parseInt(s);
        int destination = Integer.parseInt(b);
        if ((source <= 2 && destination <= 2) | (source >= 3 && destination >= 3)) {
            natively = true;
        } else {
            natively = false;
        }
        FlightBooking.TripDestination fff;
        FlightBooking.DestinationAirport fft;
        switch (b) {
            case "1":
                fff = TripDestination.NANJING;
                fft = DestinationAirport.NanjingLukouInternationalAirport;
                break;
            case "2":
                fff = TripDestination.BEIJING;
                fft = DestinationAirport.BeijingCapitalInternationalAirport;
                break;
            case "3":
                fff = TripDestination.OULU;
                fft = DestinationAirport.OuluAirport;
                break;
            case "4":
                fff = TripDestination.HELSINKI;
                fft = DestinationAirport.HelsinkiAirport;
                break;
        }
    }
    else{
System.out.println("what a fucking assignment!why do not you check it in flesh!the machine check is a lump of garbage");
    }
    }
    public String getTripDestination() {return this.tripDestination;}
    TripType ty;
    public void setTripType(String s){
switch (s){
    case"1":ty=TripType.ONE_WAY;
    break;
    case"2":ty=TripType.RETURN;
    break;
}
    }

FlightBooking.BookingClass bs;
    public void setBookingClass(String b){
        switch (b){
            case"1":bs=BookingClass.FIRST;
            break;
            case"2":bs=BookingClass.BUSINESS;
            break;
            case"3":bs=BookingClass.ECONOMY;
            break;
        }
    }
    public BookingClass getBookingClass(){
        return bs;
    }
    public void setTicketNumber(){
        String a,b,c;
        if (natively==true){
            c="DOM";
        }else {
            c="INT";
        }
        if(ty==TripType.ONE_WAY){
            a="11";
        }else {
            a="22";
        }
        if(bs==BookingClass.FIRST){
            b="F";
        } else if (bs==BookingClass.BUSINESS) {
            b="B";
        }else {
            b="E";
        }
        ticketNumber=a+b+"PQHK"+c;

    }

    public String getTicketNumber() {
        setTicketNumber();

return ticketNumber;
    }



    public int getChildrenPassengers() {
        return this.childPassengers;
    }

    public int getAdultPassengers() {
        return adultPassengers;
    }

    public String getFlightID() {
        return this.flightID;
    }

    public String getPassengerFullName() {
        return this.passengerFullName;
    }
    public String getSourceAirport() {
        return this.sourceAirport;
    }



    public String getDestinationAirport() {
        return this.destinationAirport;
    }

    public void setTotalPassengers(int childPassengers, int adultPassengers) {
        this.totalPassengers = childPassengers + adultPassengers;
        this.totalPassengers = totalPassengers;
    }



    public LocalDate getDepartureDate() {
        return this.departureDate;
    }

    public LocalDate getReturnDate() {return  this.returnDate;}
    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }
    public void setReturnDate(LocalDate returnDate) {
        long dategap=ChronoUnit.DAYS.between(departureDate,returnDate);
        if(dategap<2){
            returnDate=departureDate.plusDays(2);
            dateerror=true;
        }
        else{
            dateerror=false;
        }
        this.returnDate = returnDate;
    }
    public void setDepartingTicketPrice(double child, double adults) {
        double c=child;
        double a=adults;
        double addition;
        double rateoftax;double rateofservice;
        if(natively==true){
            rateofservice=0.05;
            rateoftax=0.1;
        }
        else {
            rateofservice=0.1;
            rateoftax=0.05;
        }
        switch (bs){
            case FIRST:addition=250;break;
            case BUSINESS:addition=150;break;
            case ECONOMY:addition=50;break;
            default:
                throw new IllegalStateException("Unexpected value: " + bs);
        }
        departingTicketPrice=(c+a)*300+(c+a)*300*rateofservice+(c+a)*300*rateoftax+addition;
    }
    public double getDepartingTicketPrice() {

        return this.departingTicketPrice;
    }
    public void setReturnTicketPrice() {
        if(ty==TripType.ONE_WAY){
            returnTicketPrice=0;
        }
        else{
            returnTicketPrice=departingTicketPrice;
        }
    }
    public double getReturnTicketPrice() {

        return this.returnTicketPrice;
    }
    public void setTotalTicketPrice() {
       totalTicketPrice=departingTicketPrice+returnTicketPrice;
    }

    public double getTotalTicketPrice() {
       return totalTicketPrice;
    }









    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public void setAdultPassengers(int adultPassengers) {
        this.adultPassengers = adultPassengers;
    }

    public void setChildPassengers(int childPassengers) {
        this.childPassengers = childPassengers;
    }


    public void setPassengerFullName(String passengerFullName) {
        this.passengerFullName = passengerFullName;
    }







    public String getFlightCompany() {
        return this.flightCompany;
    }

    public int getTotalPassengers() {
        this.totalPassengers = this.adultPassengers + this.childPassengers;
        return totalPassengers;
    }


}

