package entity;

import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private String author;
    private Integer publishedYear;
    private String isbn;

    public Book() {
    }

    public Book(String name, String author, Integer publishedYear, String isbn) {
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(Integer publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Имя: " + name
                + ", Автор: " + author
                + ", Год издания: " + publishedYear
                + ", ISBN: " + isbn;
    }
}