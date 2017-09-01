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
public class EvenOdd {
    public static  void main(String a[]){
        System.out.println("Enter the number(integer): ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n%2==0){
            System.out.println("The entered nubmer is EVEN");
        }else{
            System.out.println("The entered nubmer is ODD");
        }
    }
}
