/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortPackage;

import java.util.ArrayList;

/**
 *
 * @author norhan
 */
public class sortAlgorithms {
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> list){
        int temp;
        for(int i=1;i<list.size();i++){
            int j=i;
            while(j>=1 && list.get(j-1)>list.get(j)){
               temp = list.get(j);
               list.set(j,list.get(j-1));
               list.set(j-1, temp);
               j--;
            }
            
        }
        return list;
        
    }
}
