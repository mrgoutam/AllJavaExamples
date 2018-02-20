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
public class CompareDateUsingCompareTo {
    public static void main(String[] args) {
   
    //create first date object
    Date d1 = new Date();
 
    //make interval of 10 millisecond before creating second date object    
    try{
      Thread.sleep(1000);
    }catch(Exception e){
        e.printStackTrace();
    }
   
   
    //create second date object
    Date d2 = new Date();
   
    System.out.println("First Date : " + d1);
    System.out.println("Second Date : " + d2);
   
    /*
     Use compareTo method of java Date class to compare two date objects.
     compareTo returns value grater than 0 if first date is after another date,
     returns value less than 0 if first date is before another date and returns
     0 if both dates are equal.
    */
   
    int results = d1.compareTo(d2);
    System.out.println(results);
   
    if(results > 0)
      System.out.println("First Date is after second");
    else if (results < 0)
      System.out.println("First Date is before second");
    else
      System.out.println("Both dates are equal");
  }
}
