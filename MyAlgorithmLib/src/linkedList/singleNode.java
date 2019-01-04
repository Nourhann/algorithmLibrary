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
public class singleNode {
    Data data;
    singleNode next;

    public singleNode() {
        next = null;
    }

    public singleNode(Data data, singleNode next) {
        this.data = data;
        this.next = next;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setNext(singleNode next) {
        this.next = next;
    }

    public Data getData() {
        return data;
    }

    public singleNode getNext() {
        return next;
    }
    
    
    
}
