/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.*;

/**
 *
 * @author Goutam
 */
public class HTTPURLConnectionDemo {
    public static void main(String []args) throws MalformedURLException{
        URL hp = new URL("http://www.google.com");
        //HttpURLconnection hpCon = (HttpURLConnection)hp.openConnection();
    }
}
