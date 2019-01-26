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
public class binarySearchTree implements binaryTree{
    private treeNode root;

    public binarySearchTree() {
        this.root = null; 
    }

    public void setRoot(treeNode root) {
        this.root = root;
    }
    
    public treeNode getRoot() {
        return root;
    }

    @Override
    public treeNode createTree(Data data) {
        treeNode node = new treeNode();
        node.setData(data);
        node.setLeft(null);
        node.setRight(null);
        return node;
    }

    @Override
    public treeNode insert(treeNode root,Data data) {
        if(root == null){
            return createTree(data);
        }
        else {
            if(data.getIndex()<root.getData().getIndex()){
                root.setLeft(insert(root.getLeft(),data));
            }
            else {
                root.setRight(insert(root.getRight(),data));
            }
        }
        return root;
    }

    @Override
    public void delete(treeNode node) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display(treeNode root) {
       if(root==null)
           return;
       display(root.getLeft());
       System.out.println(root.getData().getIndex());
       display(root.getRight());
    }

    @Override
    public boolean search(treeNode node , Data data) {
        if(node == null)
            return false ;
        else if(node.getData().getIndex()==data.getIndex())
            return true;
        else if(data.getIndex()<node.getData().getIndex())
            return search(node.getLeft(),data);
        else {
            return search(node.getRight(),data);
        }
        
        
    }
}
