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
public class Swaping {
 
    public static void main(String args[]){
        System.out.println("Please enter the two numbers: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Before swaping the values of a and b are "+a+" and "+b);
        int m = a*b;
        a = m/a;
        b = m/b;
        System.out.println("After swaping the values of a and b are "+a+" and "+b);
    }
}
