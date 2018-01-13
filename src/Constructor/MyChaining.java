/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author Goutam
 */
public class MyChaining {
    
    public MyChaining(){
        System.out.println("In default constructor...");
    }
    public MyChaining(int i){
        //this();
        System.out.println("In single parameter constructor...");
    }
    public MyChaining(int i,int j){
        this(j);
        System.out.println("In double parameter constructor...");
    }
     
    public static void main(String a[]){
        MyChaining ch = new MyChaining(10,20);
    }
}
