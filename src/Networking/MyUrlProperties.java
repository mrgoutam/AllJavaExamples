/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;

import java.net.MalformedURLException;
import java.net.URL;

/*
The URL class provides utility methods that let you query URL objects.
You can get the protocol, authority, host name, port number, path, query, filename,
and reference from a URL using these accessor methods:
getProtocol() method returns the protocol identifier of the URL.
getAuthority() method returns the authority of the URL.
getHost() method returns the host name of the URL.
getPort() method returns the port number of the URL. If the port is not set, then it returns -1.
getPath() method returns the path of this URL.
getQuery() method returns the query of this URL.
getFile() method returns the filename of the URL.
getRef() method returns the reference of the URL.
 */
public class MyUrlProperties {
    public static void main(String a[]){
     
        try {
            String url =
        "http://www.java2novice.com:80/java_constructor_examples/?query=ok#header";
            URL myUrl = new URL(url);
            System.out.println("Protocol: "+myUrl.getProtocol());
            System.out.println("Host: "+myUrl.getHost());
            System.out.println("Port: "+myUrl.getPort());
            System.out.println("Athority of the URL: "+myUrl.getAuthority());
            System.out.println("Query: "+myUrl.getQuery());
            System.out.println("Reference: "+myUrl.getRef());
        } catch (MalformedURLException ex) {
        }
    }
}
