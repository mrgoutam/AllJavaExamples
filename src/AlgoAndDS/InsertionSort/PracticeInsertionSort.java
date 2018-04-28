/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoAndDS.InsertionSort;

/**
 *
 * @author Goutam
 */
public class PracticeInsertionSort {

    private int arr[] = {10,9,8,7,6,5,4,3,2,1};

    public static void main(String args[]) {
        
        PracticeInsertionSort pis = new PracticeInsertionSort();
        pis.ReadArray();
        pis.insertionSortingMethod();
        pis.ReadArray();
        System.out.println("");
    }

    public void insertionSortingMethod() {
       System.out.println("");
        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            int j = i - 1;
            while (j > 0 && element < arr[j]) {
                int prev = arr[j];
                arr[j] = element;
                arr[i] = prev;
                j = j-1;
            }
        }
        
        
    }
    
    private  void ReadArray(){
        for(int i=0; i< arr.length; i++){
            System.out.print( arr[i]+"\t");
        }
    }
}
