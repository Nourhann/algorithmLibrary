/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

/**
 *
 * @author norhan
 */
public interface binaryTree {
    public treeNode createTree(Data data);
    public void setRoot(treeNode root);
    public treeNode getRoot();
    public treeNode insert(treeNode node , Data data);
    public boolean search (treeNode node , Data data);
    public void delete(treeNode node);
    public void display(treeNode root);
}
