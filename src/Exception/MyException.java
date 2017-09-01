/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author Goutam
 */
public class MyException {
    public static void main(String a[]){
        for(int i=5;i>=0;i--){
            System.out.println(10/i);
        }
        System.out.println("After for loop...");
    }
}
