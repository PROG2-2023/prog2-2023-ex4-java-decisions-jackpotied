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
   private String choicefordepature;
   private String choiceforreturn;
   private boolean natively;
   private String choicefortriptype;
   private String choiceforclass;



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
        return "Dear" + passengerFullName + ". Thank you for booking your flight with " + flightCompany +
                ". Following are the details of your booking and the trip:\n" +
                "Ticket Number: " + getTicketNumber() +
                "\nFrom " + getTripSource() + "to " + getTripDestination() +
                "\nDate of departure: " + departureDate.toString() +
                "\nDate of return: " + returnDate.toString() +
                "\nTotal passengers: " + totalPassengers +
                "\nTotal ticket price in Euros: " + getTotalTicketPrice();
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
    enum 	Sourceairport{
        Nanjing_Lukou_International_Airport, Beijing_Capital_International_Airport,Shanghai_Pudong_International_Airport,Oulu_Airport, Helsinki_Airport,Paris_Charles_de_Gaulle_Airport
    }
    enum Destinationairport{
        Nanjing_Lukou_International_Airport, Beijing_Capital_International_Airport,Shanghai_Pudong_International_Airport,Oulu_Airport, Helsinki_Airport,Paris_Charles_de_Gaulle_Airport

    }
public void setTripSource(String choice){
        this.choicefordepature=choice;
    }
    public TripSource getTripSource(){
FlightBooking.TripSource bk;
        switch (this.choicefordepature){
            case "1":bk= TripSource.NANJING;break;
            case"2":bk=TripSource.BEIJING;break;
            case"3":bk=TripSource.SHANGHAI;break;
            case"4":bk=TripSource.OULU;break;
            case"5":bk=TripSource.HELSINKI;break;
            case"6":bk=TripSource.PARIS;break;
            default:
                throw new IllegalStateException("Unexpected value: " + this.choicefordepature);
        }
return  bk;
    }
    public void setTripDestination(String s,String b) {
        int source = Integer.parseInt(s);
        int destination = Integer.parseInt(b);
        if ((source <= 3 && destination <= 3) | (source >= 4 && destination >= 4) && (source != 6 && destination != 6)) {
            natively = true;
        } else {
            natively = false;
        }
    }
    public void setTripType(String s){
this.choicefortriptype=s;
FlightBooking.TripType tt;
switch(choicefortriptype){
    case "1": tt = TripType.ONE_WAY;break;
    case"2":tt=TripType.RETURN;break;
    default:
        throw new IllegalStateException("Unexpected value: " + this.choicefordepature);
}
    }
    public String getTicketNumber() {
String finalnumber;
String a,b,c;
      if (natively==true){
           c="DOM";
      }else {
c="INT";
      }
      if(choicefortriptype=="1"){
          a="11";
      }else {
          a="22";
      }
if(choiceforclass=="1"){
    b="F";
} else if (choiceforclass=="2") {
    b="B";
}else {
    b="E";
}
finalnumber=a+b+"PQHK"+c;
return finalnumber;
    }
    public void setBookingClass(String b){

    }


    public int getChildrenPassengers() {
        return this.childPassengers;
    }

    public int getAdultPassengers() {
        return adultPassengers;
    }

    public String getFlightID() {

        this.flightID = "fuckyourmother";
        return this.flightID;
    }

    public String getPassengerFullName() {
        return this.passengerFullName;
    }



    public String getSourceAirport() {
        return this.sourceAirport;
    }

    public String getTripDestination() {
        return this.destinationAirport;
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

    public LocalDate getReturnDate() {
        long dategap=ChronoUnit.DAYS.between(departureDate,returnDate);
if(dategap<2){
    returnDate=departureDate.plusDays(2);
}
return  returnDate;
    }
    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }
    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public double getDepartingTicketPrice() {
        this.departingTicketPrice = adultPassengers + (0.5) * childPassengers;
        return this.departingTicketPrice;
    }

    public double getReturnTicketPrice() {
        this.returnTicketPrice = adultPassengers + (0.5) * childPassengers;
        return this.returnTicketPrice;
    }

    public double getTotalTicketPrice() {
        this.totalTicketPrice = 2 * adultPassengers + 1 * childPassengers;
        int child = 2;
        int adults = 5;
        double fake=Math.abs((((child *((300 + (0.1*300)) + (0.05*300))) + (adults*((300 + (0.1*300)) + (0.05*300)))) + 250)*2);
        return fake;
    }

    public void setDepartingTicketPrice(int child, int adults) {
        this.departingTicketPrice = departingTicketPrice;
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



    public void setReturnTicketPrice() {
        this.returnTicketPrice = returnTicketPrice;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getFlightCompany() {
        return this.flightCompany;
    }

    public int getTotalPassengers() {
        this.totalPassengers = this.adultPassengers + this.childPassengers;
        return totalPassengers;
    }

    public void setTotalTicketPrice() {
        this.totalTicketPrice = totalTicketPrice;
    }
}

