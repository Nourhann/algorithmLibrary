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
public abstract class Decorator extends LibraryItem {
    protected LibraryItem Libraryitem;

    public Decorator(LibraryItem Libraryitem) {
        this.Libraryitem = Libraryitem;
    }
    public void Display(){
        Libraryitem.Display();
    }
}
