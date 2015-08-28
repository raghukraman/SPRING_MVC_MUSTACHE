package com.raghu.examples.vo;

import java.io.Serializable;
import java.util.List;






public class Book implements Serializable {

    private String name;

    private String isbn;

    private String url;

    private List<Book> similarBooks;

    private List<Author> authors;
    
    private Integer pages;
    
    public Book() {  
    }

    public Book(String name, String isbn, String url,Integer pages) {
        super();
        this.name = name;
        this.isbn = isbn;
        this.url = url;
        this.pages=pages;
    }

    public Book(String name, String isbn, String url, List<Book> similarBooks,List<Author> authors,Integer pages) {
        super();
        this.name = name;
        this.isbn = isbn;
        this.url = url;
        this.similarBooks = similarBooks;
        this.pages=pages;
        this.authors=authors;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getIsbn() {
        return isbn;
    }

    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    
    public String getUrl() {
        return url;
    }

    
    public void setUrl(String url) {
        this.url = url;
    }

    
    public List<Book> getSimilarBooks() {
        return similarBooks;
    }

    
    public void setSimilarBooks(List<Book> similarBooks) {
        this.similarBooks = similarBooks;
    }

    
    public List<Author> getAuthors() {
        return authors;
    }

    
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    
    public Integer getPages() {
        return pages;
    }

    
    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", isbn=" + isbn + ", url=" + url + ", similarBooks=" + similarBooks
               + ", authors=" + authors + ", pages=" + pages + "]";
    }

   
    
    
    
    

}
