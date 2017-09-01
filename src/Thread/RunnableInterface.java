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
public class RunnableInterface implements Runnable{

    @Override
    public void run() {
        System.out.println("thread is running...");
    }
    public static void main(String args[]){
        RunnableInterface ri = new RunnableInterface();
        Thread t = new Thread(ri);
        t.run();
    }
}
