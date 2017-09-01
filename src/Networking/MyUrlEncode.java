/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/*
URLEncoder is a utility class for HTML form encoding. 
This class contains static methods for converting a String to the application/x-www-form-urlencoded MIME format. 
Below example shows how to encode URL content in java. This class is very useful to encode query string values.
 */
public class MyUrlEncode {
    public static void main(String a[]){
     
        try {
            System.out.println(URLEncoder.encode("String with spaces", "UTF-8"));
            System.out.println(URLEncoder.encode("special chars: &%*", "UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }
}
