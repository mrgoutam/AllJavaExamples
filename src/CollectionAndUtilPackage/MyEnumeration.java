/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionAndUtilPackage;

import java.util.Enumeration;
import java.util.Vector;

/*
A class that implements Enumeration interface provides access to series of elements one at a time.
You need to call nextElement method to get next element in the series.
Also hasMoreElements() method gives you status about the availability of next element in the series.
 */
public class MyEnumeration {
    public static void main(String []a){
        Vector<String> vector = new Vector<String>();
        Enumeration<String> enumeration = null;
        vector.add("JAVA");
        vector.add("JSP");
        vector.add("SERVLET");
        vector.add("EJB");
        vector.add("PHP");
        enumeration = vector.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
            
        }
        
    }
}
