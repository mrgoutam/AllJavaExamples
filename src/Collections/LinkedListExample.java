/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.LinkedList;

/**
 *
 * @author Goutam
 */
public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");
        System.out.println("Linked List Content: " + linkedlist);
        
        linkedlist.addFirst("Goutam");
        linkedlist.addLast("Mousam");
        System.out.println("LinkedList Content after addition: " +linkedlist);

        Object firstvar = linkedlist.get(0);
        System.out.println("First element: " +firstvar);
        
        linkedlist.set(0, "Changed first Item");
        Object firstvar2 = linkedlist.get(0);
       System.out.println("First element after update by set method: " +firstvar2);
       
       linkedlist.add(0, "Newly added item");
       linkedlist.remove(2);
       System.out.println("Final Content: " +linkedlist); 

    }
}
