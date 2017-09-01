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
public class TestCallRun1 extends Thread{
    public static void main(String args[]){
        TestCallRun1 t = new TestCallRun1();
        t.run(); //fine but it is not a thread
    }
    @Override
    public void run(){
        System.out.println("Running...");
    }
}
