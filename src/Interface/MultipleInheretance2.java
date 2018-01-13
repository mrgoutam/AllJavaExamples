/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Goutam
 */
public class MultipleInheretance2 implements InterfaceA, InterfaceB{

    @Override
    public void method() {
        System.out.println("See the differences in case of mulitiple inheretance");
    }
    
    public static void main(String args[]){
        MultipleInheretance2 i = new MultipleInheretance2();
        i.method();
        
    }
}
