/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author Goutam
 */
public class MyThrowsClause {
    public static void main(String a[]){
        MyThrowsClause mytc = new MyThrowsClause();
        try{
            for(int i=0; i<5; i++){
                mytc.getJunk();
                System.out.println(i);
            }
        } catch (InterruptedException iex){
            iex.printStackTrace();
        }
    }
     
    public void getJunk() throws InterruptedException {
        Thread.sleep(1000);
    }
}
