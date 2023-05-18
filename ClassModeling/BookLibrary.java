package ClassModeling;

public class BookLibrary {
    private String author;
    private String title;
    private int yearPublished;
    private boolean isFiction;
    private String section;
    private int callNumber;
    private int copiesAvailable;

    public BookLibrary() {
        /*
        this.author = "John Doe";
        this.title = "Death of Rose";
        this.yearPublished = 2000;
        this.isFiction = true;
        this.section = "Mystery";
        this.callNumber = 4945;
        this.copiesAvailable = 2;
         */
    }

    public BookLibrary(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public BookLibrary(String author, String title, int yearPublished, boolean isFiction, String section, int callNumber, int copiesAvailable) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
        this.isFiction = isFiction;
        this.section = section;
        this.callNumber = callNumber;
        this.copiesAvailable = copiesAvailable;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public boolean getIsFiction() {
        return isFiction;
    }

    public void setIsFiction(boolean fiction) {
        isFiction = fiction;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(int callNumber) {
        this.callNumber = callNumber;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }


}


