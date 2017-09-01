/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionAndUtilPackage.Vector;

import java.util.Vector;

/*
Below example shows how to create exactly same object as available vector object. 
You can use clone() method to create similar copy of vector.
 */
public class MyVectorClone {
    public static void main(String a[]){
        Vector<String> vct = new Vector<String>();
        //adding elements to the end
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        System.out.println("Actual vector:"+vct);
        Vector<String> copy = (Vector<String>) vct.clone();
        System.out.println("Cloned vector:"+copy);
    }
}
