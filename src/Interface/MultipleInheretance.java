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
public class MultipleInheretance implements printable, Drawable{

    @Override
    public void print() {
        System.out.println("Welcome");
    }

    @Override
    public void draw() {
        System.out.println("Interface");
    }
    
    public static void main(String a[]){
        MultipleInheretance mi = new MultipleInheretance();
        mi.print();
        mi.draw();
    }
}
