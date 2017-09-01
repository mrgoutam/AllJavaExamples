/*
 The Vector class implements a growable array of objects. Like an array,
it contains components that can be accessed using an integer index. However,
the size of a Vector can grow or shrink as needed to accommodate adding and removing items 
after the Vector has been created.
 */
package CollectionAndUtilPackage.Vector;

import java.util.Vector;

/*
Below example shows how to create vector object, adding elements to it, getting elements by specifying index,
getting elements index, getting first element, getting last element, and is vector is empty or not.
 */
public class BasicVectorOperations {
    public static void main(String []a){
        Vector<String> vtr = new Vector<String>();
        //adding elements to the end
        
        vtr.add("First");
        vtr.add("Second");
        vtr.add("Third");
        System.out.println(vtr);
        
        //adding element at specified index
        vtr.add(2, "Random");
        System.out.println(vtr);
        
        //getting element by index
        System.out.println(vtr.get(3));
        
        System.out.println("The first element of this vector is: "+vtr.firstElement());
        //getting last element
        System.out.println("The last element of this vector is: "+vtr.lastElement());
        //how to check vector is empty or not
        System.out.println("Is this vector empty? "+vtr.isEmpty());
    }
}
