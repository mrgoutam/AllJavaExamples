/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;
import java.net.*;
/**
 *
 * @author Goutam
 */
public class InetAddressTest {
    public static void main(String []args) throws UnknownHostException{
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        
        address = InetAddress.getByName("www.google.com");
        System.out.println(address);
        
        InetAddress sw[] = InetAddress.getAllByName(null);
        for (int i = 0; i<sw.length; i++){
            System.out.println(sw[i]);
        }
        
       
    }
}
