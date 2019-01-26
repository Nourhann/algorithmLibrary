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
public class treeNode {
    private Data data;
    private treeNode left;
    private treeNode right;

    public treeNode() {
    }

    public treeNode(Data data, treeNode left, treeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setLeft(treeNode left) {
        this.left = left;
    }

    public void setRight(treeNode right) {
        this.right = right;
    }

    public Data getData() {
        return data;
    }

    public treeNode getLeft() {
        return left;
    }

    public treeNode getRight() {
        return right;
    }
    
    
}
