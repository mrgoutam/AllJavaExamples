/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

/**
 *
 * @author Goutam
 */
public class LargestSmallestInArray {
    private int[] n= {12,14,6,23,1,160,500};
    int largest = n[0];
    int smallest = n[0];
    public static void main(String a[]){
        //array of 10 numbers
                int numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23};
               
                //assign first element of an array to largest and smallest
                int smallest = numbers[0];
                int largetst = numbers[0];
               
                for(int i=1; i< numbers.length; i++)
                {
                        if(numbers[i] > largetst)
                                largetst = numbers[i];
                        else if (numbers[i] < smallest)
                                smallest = numbers[i];
                       
                }
               
                System.out.println("Largest Number is : " + largetst);
                System.out.println("Smallest Number is : " + smallest);
        }
}
