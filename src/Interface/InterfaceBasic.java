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
public class InterfaceBasic implements printable{

    @Override
    public void print() {
        System.out.println("Hello Interface");
    }
    
    public static void main(String a[]){
        InterfaceBasic interfaceBasic = new InterfaceBasic();
        interfaceBasic.print();
    }
}
