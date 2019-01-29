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
public abstract class LibraryItem {
    protected int numOfcopies;

    public void setNumOfcopies(int numOfcopies) {
        this.numOfcopies = numOfcopies;
    }

    public int getNumOfcopies() {
        return numOfcopies;
    }
    
    public abstract void Display();
}
