package ClassModeling;

public class AppBookLibrary {
    public static void main(String[] args) {
        BookLibrary book1 = new BookLibrary();
        BookLibrary book2 = new BookLibrary();
        BookLibrary book3 = new BookLibrary("Allan Doe", "A Flower");

        book2.setAuthor("David Linch");
        System.out.println("Author: "+ book1.getAuthor()); //default constructor value = null
        System.out.println("Author: "+ book2.getAuthor()); // with setAuthor we assigned the name
        System.out.println("Author: "+ book3.getAuthor() + "and the title: " + book3.getTitle()); //constructor initialized with two fields


    }
}
