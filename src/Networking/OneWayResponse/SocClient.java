/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking.OneWayResponse;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author Goutam
 */
public class SocClient {
    public static void main(String [] args) throws IOException{
        String ip = "localhost";
        int port = 9999;
        Socket socket = new Socket(InetAddress.getLocalHost(),port);
         
        String str= "Goutam Das";
        
        //outputstreamwriter convert our data to stream formate
        //socket.getoutputstream means from where we want to sent data
        OutputStreamWriter os = new OutputStreamWriter(socket.getOutputStream());
        
        //out is a printwriter object by which we can sent the data
        PrintWriter out = new PrintWriter(os);
        //writing the str data
        os.write(str);
        os.flush();
    }
}
