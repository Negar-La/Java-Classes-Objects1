package ClassModeling;

public class HouseGPS {

    //private characteristics of this class:
    private String country;
    private String city;
    private String street;
    private int streetNumber;
    private int houseNumber;
    private double latitude;
    private double longitude;

    //constructor (right-click-> Generate -> select which characteristics you want to put as parameter:
    public HouseGPS() {

    }

    public HouseGPS(String country, String city, String street, int streetNumber, int houseNumber, double latitude, double longitude) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
        this.houseNumber = houseNumber;
        this.latitude = latitude;
        this.longitude = longitude;
    }



//This was another constructor with empty ()
/*
        public HouseGPS () {
        this.country = "Canada";
        this.city = "Montreal";
        this.houseNumber = 23;
        this.street = "Mont Royal";
        this.streetNumber = 600;
        this.latitude = 45.486062;
        this.longitude = -73.576066;
    }
*/

    //using Generate option to create all getters and setters in IntelliJ
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    //you don't need this helper method, in App u will use set and get methods!
    /*
    public String getLocation(double latitude, double longitude){
        String location = "The house is located at " +latitude+ " north and " +longitude+ " south";
        return location;
    }

    public void navigate() {

    }
    */

}
