package kr.book.search;

public class Book {
    private String titlee;
    private String authors;
    private String publisher;
    private String thumnail;

    public Book() {
    }

    public Book(String titlee, String authors, String publisher, String thumnail) {
        this.titlee = titlee;
        this.authors = authors;
        this.publisher = publisher;
        this.thumnail = thumnail;
    }

    public String getTitlee() {
        return titlee;
    }

    public void setTitlee(String titlee) {
        this.titlee = titlee;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getThumnail() {
        return thumnail;
    }

    public void setThumnail(String thumnail) {
        this.thumnail = thumnail;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titlee='" + titlee + '\'' +
                ", authors='" + authors + '\'' +
                ", publisher='" + publisher + '\'' +
                ", thumnail='" + thumnail + '\'' +
                '}';
    }
}
