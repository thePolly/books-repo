package entities;


public class Book {

    private long bookId;
    private String name;
    private long author;
    private long year;
    private String genre;
    private String subject;


    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public long getAuthor() {
        return author;
    }

    public void setAuthor(long author) {
        this.author = author;
    }


    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}

