/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
You can get IP address of any host by using InetAddress class. 
By calling getByName() method with host name as parameter, it returns InetAddress object. 
On this object you can call getHostAddress() method to get the IP address of the given host.
 */
public class MyIpByHost {
    public static void main(String a[]){
     
        try {
            InetAddress host = InetAddress.getByName("www.java2novice.com");
            System.out.println(host.getHostAddress());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}
