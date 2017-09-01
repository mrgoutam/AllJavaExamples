/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/*
URLDecoder is a utility class for HTML form decoding. 
This class contains static methods for decoding a String from the application/x-www-form-urlencoded MIME format. 
Below example shows how to decode an encoded string.
 */
public class MyURLDecode {
    public static void main(String a[]){
        try {
            System.out.println(URLDecoder.decode("special+chars%3A+%26%25*+", "UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }
}
