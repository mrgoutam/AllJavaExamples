/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
Below example shows how to get IP address of a host or machine. 
You can get it by using InetAddress class. getLocalHost() method returns the information about the host, 
and returns InetAddress object. If you call getHostAddress() method, you can get IP address of the host.
 */
public class MyIpAddress {
    public static void main(String a[]){
     
        try {
            InetAddress ipAddr = InetAddress.getLocalHost();
            System.out.println(ipAddr.getHostAddress());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}
