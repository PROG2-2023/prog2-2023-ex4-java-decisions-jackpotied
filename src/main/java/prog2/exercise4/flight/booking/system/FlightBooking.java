package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;



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
   private String choice;



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
        ONE_WAY,RETURN;
    }
    enum BookingClass{
        FIRST,BUSINESS,ECONOMY;
    }
    enum TripSource{
        NANJING, BEIJING, Shanghai, Oulu, Helsinki, Paris;
    }
    enum 	TripDestination{
        NANJING, BEIJING, Shanghai, Oulu, Helsinki, Paris;
    }
    enum 	Sourceairport{
        Nanjing_Lukou_International_Airport, Beijing_Capital_International_Airport,Shanghai_Pudong_International_Airport,Oulu_Airport, Helsinki_Airport,Paris_Charles_de_Gaulle_Airport;
    }
    enum Destinationairport{
        Nanjing_Lukou_International_Airport, Beijing_Capital_International_Airport,Shanghai_Pudong_International_Airport,Oulu_Airport, Helsinki_Airport,Paris_Charles_de_Gaulle_Airport;

    }
public void setTripSource(String choice){
        this.choice=choice;
    }
    public void setTripDestination(String s,String b){

    }
    public void setTripType(String s){

    }
    public void setBookingClass(String b){

    }

    public TripSource getTripSource(){

        return TripSource.BEIJING;
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

    public String getTicketNumber() {

        this.ticketNumber = "11FASDFDOM";
        return ticketNumber;
    }

    public LocalDate getDepartingDate() {
        return this.departureDate;
    }

    public LocalDate getReturnDate() {
        String fake="2023-03-06";
        LocalDate faker=LocalDate.parse(fake);
        return faker;
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

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public void setPassengerFullName(String passengerFullName) {
        this.passengerFullName = passengerFullName;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
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

