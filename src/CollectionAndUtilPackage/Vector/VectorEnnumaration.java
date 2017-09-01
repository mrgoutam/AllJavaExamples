/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionAndUtilPackage.Vector;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Goutam
 */
public class VectorEnnumaration {
     public static void main(String a[]){
        Vector<String> vct = new Vector<String>();
        //adding elements to the end
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        Enumeration<String> enm = vct.elements();
        while(enm.hasMoreElements()){
            System.out.println(enm.nextElement());
        }
    }
}
