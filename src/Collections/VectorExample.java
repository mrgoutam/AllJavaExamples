/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Goutam
 */
public class VectorExample {

    public static void main(String[] args) {
        Vector<String> vec = new Vector<String>(2);

        vec.addElement("Apple");
        vec.addElement("Orange");
        vec.addElement("Mango");
        vec.addElement("Fig");

        System.out.println("Size is: "+vec.size());
      System.out.println("Default capacity increment is: "+vec.capacity());
      
      vec.addElement("fruit1");
      vec.addElement("fruit2");
      vec.addElement("fruit3");

      /*size and capacityIncrement after two insertions*/
      System.out.println("Size after addition: "+vec.size());
      System.out.println("Capacity after increment is: "+vec.capacity());
      
      Enumeration en = vec.elements();
      System.out.println("\nElements are:");
      while(en.hasMoreElements())
         System.out.print(en.nextElement() + " ");
   
    }
}
