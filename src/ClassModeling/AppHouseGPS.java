package src.ClassModeling;

public class AppHouseGPS {
    public static void main(String[] args) {
        HouseGPS house1 = new HouseGPS();
        HouseGPS house2 = new HouseGPS();
        HouseGPS house3 = new HouseGPS("Canada", "toronto", "park", 1, 12, 22.22, 17.17);


        int houseNumberInfo = house1.getHouseNumber();  //default is zero
        System.out.println("The house number for first house is "+  houseNumberInfo+ ".");

        house2.setHouseNumber(10);
        System.out.println("The house number for second house is " + house2.getHouseNumber()+ ".");

        house1.setLatitude(10);
        house1.setLongitude(1010);
        System.out.println("The house is located at "+ house1.getLatitude() + "north and  " + house1.getLongitude()  + " south"+ ".");

        System.out.println("house 3 is in " + house3.getCountry() + ", the city of "+ house3.getCity()+ ".");
    }
}
