/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionAndUtilPackage.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Goutam
 */
public class ArrayListIterator {
    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        Iterator<String> itr = arrl.iterator();
        System.out.println(arrl);
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
