/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myalgorithmlib;

import java.util.ArrayList;
import linkedList.Data;
import linkedList.singleLinkedList;
import linkedList.singleNode;
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
      singleLinkedList LinkedList = new singleLinkedList() ;
      singleNode node = new singleNode(new Data(1),null);
      singleNode node2 = new singleNode(new Data(2),null);
      singleNode node3 = new singleNode(new Data(3),null);
      LinkedList.setRoot(node);
      //System.out.println(LinkedList.getRoot().getData().getIndex());
      LinkedList.insertFirst(node2);
      LinkedList.insertLast(node3);
      //LinkedList.delete(node3);
      LinkedList.deleteLast();
      LinkedList.display();
      
      
      
    }
    
}
