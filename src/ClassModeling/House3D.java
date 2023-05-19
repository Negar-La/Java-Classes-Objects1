package src.ClassModeling;

public class House3D {
    private double length;
    private double width;
    private double height;
    private String color;
   private int numOfRooms;

   private boolean hasBackYard;

    public House3D() {

    }
    public House3D(double length, double width, double height, String color, int numOfRooms, boolean hasBackYard) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.numOfRooms = numOfRooms; //or       setNumOfRooms(numOfRooms);
        this.hasBackYard = hasBackYard; //or     setHasBackYard(hasBackYard);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public boolean isHasBackYard() {
        return hasBackYard;
    }

    public void setHasBackYard(boolean hasBackYard) {
        this.hasBackYard = hasBackYard;
    }
//define methods associated with behaviors
    public void buildRoom() {

    }

    public void buildBathroom() {

    }

    public void buildHouse() {

    }

    public void buildBackYard() {

    }
}
