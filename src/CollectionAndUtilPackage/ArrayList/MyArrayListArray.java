/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionAndUtilPackage.ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Goutam
 */
public class MyArrayListArray {

    public static void main(String a[]) {
        ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:" + arrl);
        String[] strArr = new String[arrl.size()];
        arrl.toArray(strArr);
        System.out.println("Created Array content:");
        for (String str : strArr) {
            System.out.println(str);
        }
    }
}
