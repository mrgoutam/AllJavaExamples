/*
 All of the collection classes provides iterator() method to iterate through the collection. 
The iterator() method returns the Iterator object through which you can access the collection 
elements in an order. Enumeration also does the same purpose. The difference between Iterator
and Enumerations is: Iterators allow the caller to remove elements from the underlying collection
during the iteration with well-defined semantics.
 */
package CollectionAndUtilPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*

 */
public class MyCollectionIterator {
    public static void main(String []a){
        String removeElem = "Python";
        List<String> myList = new ArrayList<String>();
        myList.add("Java");
        myList.add("Unix");
        myList.add("Oracle");
        myList.add("C++");
        myList.add("Perl");
        myList.add("C");
        myList.add("Python");
        
        Iterator<String> itr = myList.iterator();
        System.out.println("Befor remove element from myList");
        System.out.println(myList);
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("After remove element from myList");
        while(itr.hasNext()){
            if(removeElem.equals(itr.next())){
                itr.remove();
            }
            
        }
        System.out.println(myList);
    }
}
