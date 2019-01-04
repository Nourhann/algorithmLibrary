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
public class singleLinkedList implements linkedList  {
    private Node root;
    private int sizeOfLinkedList;

    public singleLinkedList() {
    }

    public singleLinkedList(Node root, int sizeOfLinkedList) {
        this.root = root;
        this.sizeOfLinkedList = sizeOfLinkedList;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public int getSizeOfLinkedList() {
        return sizeOfLinkedList;
    }

   
   
    public void insertFirst(Node node){
        node.setNext(root);
        root = node;
        sizeOfLinkedList++;
    }
    public void insertLast(Node node ){
       Node temp=root;
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
    
    public void delete(Node node){
       Node temp=root;
       Node previous=root;
       
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

    
    public void deleteLast() {
       Node temp=root;
       while(temp.getNext().getNext()!=null){
           temp=temp.getNext();
       }
       temp.setNext(null);
       sizeOfLinkedList--;
    }


    public void display() {
       Node temp=root;
       while(temp!=null){
           System.out.println(temp.getData().getIndex());
           temp=temp.getNext();
       }
    }
}
