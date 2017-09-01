/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionAndUtilPackage.Vector;

import java.util.Vector;

/**
 *
 * @author Goutam
 */
public class MyVectorArrayCopy {
     public static void main(String a[]){
        Vector<String> vct = new Vector<String>();
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        System.out.println("Actual vector:"+vct);
        String[] copyArr = new String[vct.size()];
        vct.copyInto(copyArr);
        System.out.println("Copied Array content:");
        for(String str:copyArr){
            System.out.println(str);
        }
    }
}
