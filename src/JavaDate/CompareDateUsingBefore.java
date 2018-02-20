/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDate;

import java.util.Date;

/**
 *
 * @author Goutam
 */
public class CompareDateUsingBefore {
    public static void main(String[] args) {
   
    //create first date object
    Date d1 = new Date();
 
    //make interval of 10 millisecond before creating second date object    
    try{
      Thread.sleep(1000);
    }catch(Exception e){
    }
   
   
    //create second date object
    Date d2 = new Date();
   
    //use boolean before(Date anotherDate) method of Date Class to
    //check whether a date is before the specified date
   
    System.out.println("First Date : " + d1);
    System.out.println("Second Date : " + d2);
    System.out.println("Is first date before second ? : " + d1.before(d2));    
 
  }
}