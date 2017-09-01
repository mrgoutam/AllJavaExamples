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

/*
You can read content of an URL object aftter connecting to it. 
You have to call the URL's openStream() method to get a stream from which you can read the contents of the URL. 
The openStream() method returns a java.io.InputStream object, so reading from a URL is as easy as reading
from an input stream. Below example shows sample code:
 */
public class MyUrlContentRead {
    public static void main(String a[]) throws IOException{
     
        URL url = null;
        InputStream inputStream = null;
        try {
            url = new URL("http://www.java2novice.com");
            inputStream = url.openStream();
            byte[] b = new byte[8];
            while(inputStream.read(b) != -1){
                System.out.print(new String(b));
            }
        }  catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
