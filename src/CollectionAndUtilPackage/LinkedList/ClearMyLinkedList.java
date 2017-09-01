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
public class ClearMyLinkedList {
    public static void main(String a[]){
         
        LinkedList<String> arrl = new LinkedList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual LinkedList:"+arrl);
        arrl.clear();
        System.out.println("After clear LinkedList:"+arrl);
    }
}
