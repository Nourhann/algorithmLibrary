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
public class doubleNode extends Node{
     doubleNode previous;

    public doubleNode() {
        super();
        previous=null;   
    }

    public doubleNode(doubleNode previous, Data data, Node next) {
        super(data, next);
        this.previous = previous;
    }

    public void setPrevious(doubleNode previous) {
        this.previous = previous;
    }

    public doubleNode getPrevious() {
        return previous;
    }
    
    
    
    
     
    
     
}
