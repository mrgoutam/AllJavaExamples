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
public class TestSleepMethod1 extends Thread{
    public static void main(String args[]){
        TestSleepMethod1 t1 = new TestSleepMethod1();
        TestSleepMethod1 t2 = new TestSleepMethod1();
        TestSleepMethod1 t3 = new TestSleepMethod1();
        t1.start();
        t2.start();
        t3.start();
    }
    
    @Override
    public void run(){
        for(int i=1; i<=10; i++){
            try{
                Thread.sleep(300);
                System.out.println(i);
            }catch(InterruptedException ex){
                System.out.println(ex);
            }
        }
    }
    
}
