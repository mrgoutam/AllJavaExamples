/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networking.OneWayResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Goutam
 */
public class socServer {
    public static void main(String []args) throws IOException{
        
        
        System.out.println("Server is started");
        //this is tcp server socket
        ServerSocket serverSocket = new ServerSocket(9999);
        
        System.out.println("Server is waiting for client request");
        //this socket is for one client. If there is two client then we have to make two socket here
        //
        Socket socket = serverSocket.accept();
        System.out.println("client connected");
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = bufferedReader.readLine();
        //bufferedReader.close();
       
        System.out.println("client data: "+ str);
    }
}
