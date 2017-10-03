/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author Goutam
 */
public class Whois {
  public static void main(String []args) throws IOException{
      int c;
      
      //create socket associated to internic.net, port 43.
      Socket s = new Socket("whois.internic.net", 43);
      
      //Obtain an input and output stream
      InputStream in = s.getInputStream();
      OutputStream out = s.getOutputStream();
      
      //Construct a request String
      String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";
      
      //convert to bytes
      byte buf[] = str.getBytes();
      
      //Send Request.
      out.write(buf);
      
      //Read and display response
      while ((c = in.read()) != -1){
          if((c = in.read()) != -1){
              System.out.println((char)c);
          }else{
              System.out.println("There is no information");
          }
          
      }
      s.close();
  }  
}
