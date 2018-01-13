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
public class InterfaceMultipleUse {
    public static void main(String a[]){
        Circle c = new Circle();
        c.draw();
        
        Rectangle r = new Rectangle();
        r.draw();
    }
}

class Circle implements Drawable{

    @Override
    public void draw() {
        System.out.println("This is circle class");
    }
    
}

class Rectangle implements Drawable{

    @Override
    public void draw() {
        System.out.println("This is Rectangle class");
    }
    
}
