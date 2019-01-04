/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedList;

/**
 *
 * @author norhan
 */
public class doubleLinkedList implements linkedList {
    doubleNode root;
    int sizeOfLinkedList;

    public doubleLinkedList(doubleNode root) {
        this.root = root;
    }

    public doubleLinkedList() {
    }

    public void setRoot(Node root) {
        this.root = (doubleNode) root;
    }

    public Node getRoot() {
        return root;
    }

    public int getSizeOfLinkedList() {
        return sizeOfLinkedList;
    }

    @Override
    public void insertLast(Node node) {
        
       doubleNode temp=root;
       doubleNode tempNode = (doubleNode) node;
       while(temp.getNext()!=null){
         temp=(doubleNode) temp.getNext();
       }
       temp.setNext(node);
       tempNode.setPrevious(temp);
       sizeOfLinkedList++;
    }

    @Override
    public void deleteFirst() {
        root = (doubleNode) root.getNext();
        root.setPrevious(null);
        sizeOfLinkedList--;        
    }

    @Override
    public void deleteLast() {
       doubleNode temp=root;
       while(temp.getNext().getNext()!=null){
           temp=(doubleNode) temp.getNext();
       }
       temp.setNext(null);
       sizeOfLinkedList--;
    }

    @Override
    public void delete(Node node) {
       doubleNode temp=root;

       if(root.getData()==node.getData())
           deleteFirst();
       
       else {
            while(temp!=null){
                
                if(temp.getData().getIndex() == node.getData().getIndex())
                    temp.getPrevious().setNext(temp.getNext());
                
                temp=(doubleNode) temp.getNext();

            }
       }
       sizeOfLinkedList--;
    }

    @Override
    public void display() {
       Node temp=root;
       while(temp!=null){
           System.out.println(temp.getData().getIndex());
           temp=temp.getNext();
       }
    }

    @Override
    public void insertFirst(Node node) {
        node.setNext(root);
        root = (doubleNode) node;
        root.setPrevious((doubleNode) node);
        sizeOfLinkedList++;
    }


    
    
}
