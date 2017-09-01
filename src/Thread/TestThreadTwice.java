/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author Goutam
 */
public class TestThreadTwice extends Thread{
    
    @Override
    public void run(){
        System.out.println("Thread is running...");
    }
    
    public static void main(String args[]){
        TestThreadTwice t = new TestThreadTwice();
        t.start();
        t.start();
    }
}
