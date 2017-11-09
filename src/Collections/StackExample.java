/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.Stack;

/**
 *
 * @author Goutam
 */
public class StackExample {
    public static void main(String []args){
        Stack stack = new Stack();
        
        stack.push("Java");
        stack.push("Source");
        stack.push("code");
        System.out.println("Stack: "+stack);
        System.out.println("top item is: "+stack.peek());
        System.out.println("Popped item is: "+stack.pop());
         
        System.out.println("After Popped: "+stack);
                
    }
}
