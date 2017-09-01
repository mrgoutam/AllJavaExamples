/*
This package provides the classes for implementing networking applications. The java.net package can be broadly classified into two sections.
A low level API, which deals with IP Addresses, Sockets and Network Interfaces
A high level API, which deals with URLs, URIs and Connections.
 */
package Networking;

import java.net.MalformedURLException;
import java.net.URL;

/*
Class URL represents a Uniform Resource Locator, a pointer to a "resource" on the World Wide Web. A resource can be something as simple as a file or a directory, or it can be a reference to a more complicated object, such as a query to a database or to a search engine.
java.net.URL creates a URL object from the String representation.
 */
public class MySimpleUrl {
    public static void main(String []a){
        try {
            String myUrl = "http://www.java2novice.com";
            URL url = new URL(myUrl);
            System.out.println(url.toString());
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
    }
}
