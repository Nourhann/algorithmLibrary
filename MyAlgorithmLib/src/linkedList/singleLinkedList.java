/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedList;

import java.util.LinkedList;

/**
 *
 * @author norhan
 */
public class singleLinkedList {
    private singleNode root;
    private int sizeOfLinkedList;
    LinkedList l;
    
    public singleLinkedList() {
        root =null;
        sizeOfLinkedList=0;
    }

    public singleLinkedList(singleNode root, int sizeOfLinkedList) {
        this.root = root;
        this.sizeOfLinkedList = sizeOfLinkedList;
    }

    public void setRoot(singleNode root) {
        this.root = root;
        sizeOfLinkedList++;
    }

    public singleNode getRoot() {
        return root;
    }

    public int getSizeOfLinkedList() {
        return sizeOfLinkedList;
    }
    
    public void insertFirst(singleNode node){
        node.setNext(root);
        root = node;
        sizeOfLinkedList++;
    }
    public void insertLast(singleNode node ){
       singleNode temp=root;
       while(temp.getNext()!= null){
           temp = temp.getNext();
       }
       temp.setNext(node);
       sizeOfLinkedList++;
    }
    
    public void deleteFirst(){
        root = root.getNext();
        sizeOfLinkedList--;
    }
    
    public void deleteLast(){
       singleNode temp=root;
       while(temp.getNext().getNext()!=null){
           temp=temp.getNext();
       }
       temp.setNext(null);
       sizeOfLinkedList--;
    }
    public void delete(singleNode node){
       singleNode temp=root;
       singleNode previous=root;
       
       if(root.getData()==node.getData())
           deleteFirst();
       
       else {
            while(temp!=null){
                if(temp.getData().getIndex() == node.getData().getIndex())
                    previous.setNext(temp.getNext());

                previous = temp;    
                temp=temp.getNext();

            }
       }
       sizeOfLinkedList--;
    }
    public void display(){
       singleNode temp=root;
       while(temp!=null){
           System.out.println(temp.getData().getIndex());
           temp=temp.getNext();
       }
    }
}
