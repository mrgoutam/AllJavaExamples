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

    private int[] input = {8, 5, 9, 2, 4, 3, 6, 10, 0, 20};
    private int l, r, temp;

    public static void main(String[] args) {
        PracticeInsertionSort pis = new PracticeInsertionSort();
       
        pis.sortMethod();
        pis.printArr();
    }

    private void sortMethod() {
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }

    }

    private void printArr() {
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }

}
