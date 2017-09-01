/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionAndUtilPackage.Vector;

import java.util.Vector;

/*
Below example shows how to remove all elements from vector at once.
You can call clear() method to delete all elements of a vector at one call.
 */
public class ClearMyVector {
    public static void main(String a[]){
        Vector<String> vct = new Vector<String>();
        //adding elements to the end
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        System.out.println("Actual vector:"+vct);
        vct.clear();
        System.out.println("After clear vector:"+vct);
    }
}
