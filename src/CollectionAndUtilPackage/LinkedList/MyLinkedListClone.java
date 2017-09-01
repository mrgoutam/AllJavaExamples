/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionAndUtilPackage.LinkedList;

import java.util.LinkedList;

/**
 *
 * @author Goutam
 */
public class MyLinkedListClone {
    public static void main(String a[]){
         
        LinkedList<String> arrl = new LinkedList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual LinkedList:"+arrl);
        LinkedList<String> copy = (LinkedList<String>) arrl.clone();
        System.out.println("Cloned LinkedList:"+copy);
    }
}
