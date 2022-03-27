package tutorial2.Zad5;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private static long nextId = 1;
    private Long id;
    private String name;
    private Genre genre;
    private Language language;
    private LocalDate publishDate;
    private LocalDate numberOfPages;
    private int borrowCount;
    private boolean isAvailable;
    private Person author;
    private Person borrowedBy;
    private static List<Book> allBooks;

    public Book() {
    }

    public Book(String name, Genre genre, Language language, LocalDate publishDate, LocalDate numberOfPages, Person author) {
        this.name = name;
        this.genre = genre;
        this.language = language;
        this.publishDate = publishDate;
        this.numberOfPages = numberOfPages;
        this.author = author;
        id = nextId;
        nextId++;
    }

    public void borrowBook(Person person){
        borrowedBy = person;
        borrowCount++;
        isAvailable = false;
    }

    public void placeBack(){
        isAvailable = true;
        borrowedBy = null;
    }

    public static List<Book> findBookByGenre(Genre genre){
        List<Book> result = new ArrayList<>();
        for(Book book : allBooks){
            if(book.getGenre() == genre)
                result.add(book);
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public LocalDate getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(LocalDate numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public long getAge(){
        return Duration.between(LocalDate.now(), publishDate).toDays();
    }
}
