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
public class TestDaemonThread1 extends Thread {

    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {//checking for daemon thread  
            System.out.println("daemon thread work");
        } else {
            System.out.println("user thread work");
        }
    }

    public static void main(String[] args) {
        TestDaemonThread1 t1 = new TestDaemonThread1();//creating thread  
        TestDaemonThread1 t2 = new TestDaemonThread1();
        TestDaemonThread1 t3 = new TestDaemonThread1();

        t1.setDaemon(true);//now t1 is daemon thread  

        t1.start();//starting threads  
        t2.start();
        t3.start();
    }
}
