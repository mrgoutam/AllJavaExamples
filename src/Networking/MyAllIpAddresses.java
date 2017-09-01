/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
Below example shows how to get list of all IPs for the given host. By passing host name to InetAddress.
getAllByName() method, you can get list of InetAddress objects. You have to call getHostAddress() method 
on each object to get all list of IPs.

 */
public class MyAllIpAddresses {
    public static void main(String a[]){
     
        try {
            InetAddress[] myHost = InetAddress.getAllByName("www.gmail.com");
            for(InetAddress host:myHost){
                System.out.println(host.getHostAddress());
            }
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}
