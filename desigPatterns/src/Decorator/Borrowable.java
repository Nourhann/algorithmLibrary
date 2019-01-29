/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author norhan
 */
public class Borrowable extends Decorator{
    private List<String> borrowers = new ArrayList<String>(); 
    public Borrowable(LibraryItem Libraryitem) {
        super(Libraryitem);
    }
    public void BorrowItem(String name)
    {
      borrowers.add(name);
      super.Libraryitem.numOfcopies--;
    }
 
    public void ReturnItem(String name)
    {
      borrowers.remove(name);
      super.Libraryitem.numOfcopies++;
    }
    public void Display(){
        super.Display();
        System.out.println(borrowers);
    }
}
