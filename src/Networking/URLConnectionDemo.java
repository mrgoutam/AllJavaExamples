/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 *
 * @author Goutam
 */
public class URLConnectionDemo {
    public static void main(String args[]) throws MalformedURLException, IOException{
        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();
        
        //get date
        long d = hpCon.getDate();
        if(d == 0){
            System.out.println("No date information");
        }else{
            System.out.println("Date: "+ new Date(d));
        }
        
        //get Content Type
        System.out.println("Content-Type: "+ hpCon.getContentType());
        
        //get Expiration Date
        d = hpCon.getExpiration();
        if(d == 0){
            System.out.println("No expiration date found");
        }else{
            System.out.println("Expiraton Date: "+ new Date(d));
        }
        
        //get Last modified date
        d = hpCon.getLastModified();
        if(d == 0){
            System.out.println("No Last modified date found");
        }else{
            System.out.println("Last Modified Date: "+ new Date(d));
        }
        
        //get content Length
        long len = hpCon.getContentLengthLong();
        if(len == -1){
            System.out.println("Content lengh unavailable");
        }else{
            System.out.println("Content lenght:"+ len);
        }
        
        if(len != 0){
            System.out.println("=== Content ===");
            try (InputStream input = hpCon.getInputStream()) {
                while(((c = input.read()) != -1)){
                    System.out.print((char)c);
                }
            }
        }else {
            System.out.println("No content available.");
        }
    }
}
