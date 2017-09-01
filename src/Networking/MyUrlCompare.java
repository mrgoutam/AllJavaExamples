/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;

import java.net.MalformedURLException;
import java.net.URL;

/*
You can compare two URL objects by using equals method. Below example shows how to compare two URL objects.
The equals() method returns boolean value. If both URL values are same then it returns true,
otherwise it returns false.
 */
public class MyUrlCompare {
    public static void main(String a[]){
        try {
            URL mysite = new URL("http://www.java2novice.com");
            URL google = new URL("http://www.google.com");
            if(mysite.equals(google)){
                System.out.println("Both sites are equal");
            } else {
                System.out.println("Both sites are not equal");
            }
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
    }
}
