package entities;

public class Book {

    private String title;
    private Integer numberOfPages;
    private Integer year;

    private Author author;

    public Book(){

    }

    public Book(String title, Integer numberOfPages, Integer year, Author author){
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.year = year;
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "========== BOOK ==========\n" +
                "Title: " + title +
                "\nPages: " + numberOfPages +
                "\nPublishing Year: " + year +
                "\n\n----- AUTHOR -----\n" +
                author +
                "\n==========================\n\n";
    }

}