/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author Goutam
 */
public class ReverseNumber {
    int i;
    public static void main(String a[]){
        ReverseNumber rn = new ReverseNumber();
        rn.ReverseProcess();
    }
    
    public void ReverseProcess(){
        System.out.println("enter less than 10 digit number: ");
        Scanner input = new Scanner (System.in);
        i = input.nextInt();
        
        while(i>0){
            int temp = i%10;
            i = i/10;
            
            System.out.print(temp);
        }
        
    }
}
