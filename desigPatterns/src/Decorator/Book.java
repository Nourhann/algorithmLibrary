/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author norhan
 */
public class Book extends LibraryItem{
    private String author;
    private String title;

    public Book(String author, String title , int numOfcopies) {
        this.author = author;
        this.title = title;
        super.numOfcopies = numOfcopies;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void Display() {
        System.out.println("Type is book ");
        System.out.println("author is "+this.author);
        System.out.println("title is "+this.title);
        System.out.println("# of copies "+super.numOfcopies);
    }
    
}
