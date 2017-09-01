/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;

import java.net.MalformedURLException;
import java.net.URL;

/*
We can also create URL objects for files too. 
Below example shows how to create URL object for a given file. The syntax is just pass the file path after "file://".
 */
public class MyFileUrl {
    public static void main(String a[]){
        try {
            URL url = new URL("file://c:/Perl");
            System.out.println(url.toString());
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
         
    }
}
