/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myalgorithmlib;

import java.util.ArrayList;
import searchPackage.searchAlgorithms;
import sortPackage.sortAlgorithms;

/**
 *
 * @author norhan
 */
public class MyAlgorithmLib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(20);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(1);
        list = sortAlgorithms.selectionSort(list);
        System.out.println(list);
    }
    
}
