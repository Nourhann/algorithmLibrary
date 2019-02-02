/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortPackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author norhan
 */
public class sortAlgorithms {
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> list){
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
    
    public static ArrayList<Integer> selectionSort (ArrayList<Integer> list){
        int minimun , temp;
        for(int i =0 ;i<list.size();i++){
            minimun = i;
            for(int j = i+1 ;j<list.size(); j++){
                if(list.get(j)<list.get(minimun)){
                    minimun = j;
                }
            }
            if(minimun!=i){
               temp = list.get(i);
               list.set(i,list.get(minimun));
               list.set(minimun, temp);
            }
        }
        
        return list;
    }
    public static int findMaxNumInArr(ArrayList<Integer> arr){
        int max =Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.size();i++){
            if(arr.get(i)>max){
                max=arr.get(i);
            }
        }
        return max;
    }
    // do not use it if the max number is big as it will be an efficient 
    public static ArrayList<Integer> countSort(ArrayList<Integer> arr){
        int tempArr[] , tempCount;
        ArrayList<Integer> sortedArr = new ArrayList<Integer>();
        int max = findMaxNumInArr(arr);
        tempArr = new int [max+1];
        for(int i=0;i<arr.size();i++){
            tempArr[arr.get(i)]++;
        }
        for(int i=0;i<tempArr.length;i++){
            tempCount = tempArr[i];
            while(tempCount>0){
                sortedArr.add(i);
                tempCount--;
            }
            
        }
        return sortedArr; 
        
    }
    
    
    
    
//    public static List<Integer> merge(List<Integer> arr1 , List<Integer> arr2){
//        List <Integer> result = new ArrayList<Integer>();
//        //int size = arr1.size() > arr2.size() ? arr1.size() : arr2.size();
//        int indexForArr1 =0 , indexForArr2=0;
//        while(!arr1.isEmpty()&&!arr2.isEmpty()){
//            if(arr1.get(indexForArr1) < arr2.get(indexForArr2)){
//                result.add(arr1.get(indexForArr1));
//                arr1.remove(indexForArr1);
//                //indexForArr1++;
//            }
//            else {
//                result.add(arr2.get(indexForArr2));
//                arr2.remove(indexForArr2);
//                //sindexForArr2++;
//            }
//        }
//        if(!arr1.isEmpty()){
//            result.addAll(arr1);
//        }
//        if(!arr2.isEmpty()){
//            result.addAll(arr2);
//        }
//        return result;
//    }
// 
    
}
