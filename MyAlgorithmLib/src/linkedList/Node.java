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
public class Node {
    Data data;
    Node next;
    
    public Node() {
        next = null;
    }

    public Node(Data data, Node next) {
        this.data = data;
        this.next = next;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Data getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
    
    
    
}
