/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;

import java.net.MalformedURLException;
import java.net.URL;

/*
In your Java programs, you can create a URL object from a relative URL specification.
This will be useful if you have same URL and has to query with multiple relative paths,
then you create common URL object and create seperate URL objects for relative paths using commin URL object.
Below example shows how to create URL object using relative path.
 */
public class MyRelativeUrl {
    public static void main(String a[]){
        try {
            URL main = new URL("http://www.java2novice.com");
            URL relative = new URL(main,"/java_thread_examples/");
            System.out.println(relative.toString());
        } catch (MalformedURLException ex) {
 
        }
    }
}
