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
public class ClearMyArrayList {
    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        arrl.clear();
        System.out.println("After clear ArrayList:"+arrl);
    }
}
