/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
Below example shows how to get localhost's host name. 
By using InetAddress class you can get host name of the current machine. 
InetAddress.getLocalHost() provides InetAddress object, and by calling getHostName() method on it, 
will provide you the host name.
 */
public class MyLocalHostName {
    public static void main(String a[]){
        try {
            InetAddress myHost = InetAddress.getLocalHost();
            System.out.println(myHost.getHostName());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}
