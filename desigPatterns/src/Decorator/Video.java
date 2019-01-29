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
public class Video extends LibraryItem {
    private String director;
    private int playTime;
    private String title;

    public Video(String director, int playTime, String title , int numOfcopies) {
        this.director = director;
        this.playTime = playTime;
        this.title = title;
        super.numOfcopies = numOfcopies;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public int getPlayTime() {
        return playTime;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void Display() {
        System.out.println("Type is video ");
        System.out.println("director is "+this.director);
        System.out.println("play time = "+this.playTime+" min");
        System.out.println("title is "+this.title);
        System.out.println("# of copies "+super.numOfcopies);
    }
    
}
