/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myalgorithmlib;

import BinaryTree.binarySearchTree;
import BinaryTree.binaryTree;
import BinaryTree.treeNode;
import BinaryTree.Data;
import java.util.ArrayList;
//import linkedList.Data;
import linkedList.singleLinkedList;
import linkedList.Node;
import linkedList.doubleLinkedList;
import linkedList.doubleNode;
import linkedList.linkedList;
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
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr1.add(1);
        arr2.add(4);
        System.out.println(sortAlgorithms.merge(arr1,arr2));
      
      
    }
    
}
