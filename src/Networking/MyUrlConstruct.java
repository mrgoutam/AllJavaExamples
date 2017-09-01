/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;

import java.net.MalformedURLException;
import java.net.URL;

/*
The URL class provides additional constructor for creating a URL object.
This constructor is useful when you are working with URLs, such as HTTP URLs,
that have host name, filename, port number, and reference components in the resource name portion of the URL.
This constructor is useful when you do not have a String containing the complete URL specification,
but you do know various components of the URL.
 */
public class MyUrlConstruct {
    public static void main(String a[]){
     
        try {
            String protocol = "http";
            String host = "www.java2novice.com";
            int port = 80;
            String path = "/java_thread_examples/";
            URL url = new URL(protocol, host, port, path);
            System.out.println(url.toString());
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
    }
}
