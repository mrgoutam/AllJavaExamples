/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionAndUtilPackage.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Goutam
 */
public class MyArrayListShuffle {

    public static void main(String a[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        list.add("Movie");
        list.add("Girl");

        Collections.shuffle(list);
        System.out.println("Results after shuffle operation:");
        for (String str : list) {
            System.out.println(str);
        }

        Collections.shuffle(list);
        System.out.println("Results after shuffle operation:");
        for (String str : list) {
            System.out.println(str);
        }
    }
}
