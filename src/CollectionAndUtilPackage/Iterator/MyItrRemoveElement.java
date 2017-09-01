/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionAndUtilPackage.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Goutam
 */
public class MyItrRemoveElement {

    public static void main(String a[]) {

        String removeElem = "Perl";
        List<String> myList = new ArrayList<String>();
        myList.add("Java");
        myList.add("Unix");
        myList.add("Oracle");
        myList.add("C++");
        myList.add("Perl");
        System.out.println("Before remove:");
        System.out.println(myList);
        Iterator<String> itr = myList.iterator();
        while (itr.hasNext()) {
            if (removeElem.equals(itr.next())) {
                System.out.println("Element is found");
                itr.remove();
            }
        }
        System.out.println("After remove:");
        System.out.println(myList);
    }
}
