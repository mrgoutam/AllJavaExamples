/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;

import com.sun.org.apache.xerces.internal.util.URI;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Goutam
 */
public class URLDemo {
    public static void main(String args[]) throws MalformedURLException{
        URL hp = new URL("http://www.google.com");
        System.out.println("Protocol: "+hp.getProtocol());
        System.out.println("Port: "+hp.getPort());
        System.out.println("Host: "+hp.getHost());
        System.out.println("File: "+hp.getFile());
        System.out.println("External Form: "+hp.toExternalForm());
        System.out.println("Authority: "+hp.getAuthority());
        System.out.println("UserInfo: "+hp.getUserInfo());
        System.out.println("Reference: "+hp.getRef());
        System.out.println("Query: "+hp.getQuery());
    }
}
