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
public class Factorial {
    private int result;
    public static void main(String a[]){
        Factorial  f = new Factorial();
        f.Fact();
    }
    public void Fact(){
        System.out.println("Enter the nubmer: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        result = n;
                
        for (int i=1; i<n; i++){
            result = result* (n-i);
        }
        System.out.println("Fact: "+result);
    }
}
