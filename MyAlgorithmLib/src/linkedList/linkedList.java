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
public interface linkedList {
    public void setRoot(Node root);
    public Node getRoot();
    public int getSizeOfLinkedList();
    public void insertLast(Node node );
    public void insertFirst(Node node );
    public void deleteFirst();
    public void deleteLast();
    public void delete(Node node);
    public void display();
}
