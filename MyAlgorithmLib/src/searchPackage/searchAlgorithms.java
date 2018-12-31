/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchPackage;

import java.util.ArrayList;

/**
 *
 * @author norhan
 */
public class searchAlgorithms {
    
    public static int binarySearch(ArrayList<Integer> list , int key , int left , int right){
        //base case 
        if (left > right){
            return -1;
        }
        //git middle of the list 
        int middle = ( left + right )/2;
        //found the element 
        if(list.get(middle)==key)
            return middle;
        else if(list.get(middle)>key)
            return binarySearch(list,key,left,middle-1);
        else if(list.get(middle)<key)
            return binarySearch(list,key,middle+1,right);
        return -1;
    }
}
