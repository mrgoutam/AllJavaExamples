/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
Below example shows how to get host name for the given IP address.
InetAddress class helps you to get these details. The method getByName()
provides InetAddress object by passing IP address as its input.
By calling getHostName() method on this object, you can get host name.
 */
public class MyHostName {
    public static void main(String a[]){
     
        try {
            InetAddress host = InetAddress.getByName("72.167.232.155");
            System.out.println(host.getHostName());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}
