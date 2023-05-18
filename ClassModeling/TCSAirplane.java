package ClassModeling;

public class TCSAirplane {
    private int flightNumber;
    private String airline;
    private String departingFrom;
    private String arrivingAt;
    private double departureTime;
    private double arrivalTime;
    private boolean departed;
    private boolean arrived;
    private double flightDuration;

    public TCSAirplane () {

    }

    //Implement a constructor to initialize some of the property values.
    public TCSAirplane(int flightNumber, String airline) {
        this.flightNumber = flightNumber;
        this.airline = airline;
    }

    //Implement a constructor to initialize all property values.
    public TCSAirplane(int flightNumber, String airline, String departingFrom, String arrivingAt, double departureTime, double arrivalTime, boolean departed, boolean arrived, double flightDuration) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.departingFrom = departingFrom;
        this.arrivingAt = arrivingAt;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departed = departed;
        this.arrived = arrived;
        this.flightDuration = flightDuration;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getDepartingFrom() {
        return departingFrom;
    }

    public void setDepartingFrom(String departingFrom) {
        this.departingFrom = departingFrom;
    }

    public String getArrivingAt() {
        return arrivingAt;
    }

    public void setArrivingAt(String arrivingAt) {
        this.arrivingAt = arrivingAt;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(double arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public boolean getDeparted() {
        return departed;
    }

    public void setDeparted(boolean departed) {
        this.departed = departed;
    }

    public boolean getArrived() {
        return arrived;
    }

    public void setArrived(boolean arrived) {
        this.arrived = arrived;
    }

    public double getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(double flightDuration) {
        this.flightDuration = flightDuration;
    }
}


