/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Goutam
 */
public class ConvertDateFormats {
    public static void main(String[] args) {
   
    //string containing date in one format
    String strDate = "12/12/07";
   
    try
    {
      //create SimpleDateFormat object with source string date format
      SimpleDateFormat sdfSource = new SimpleDateFormat("dd/MM/yy");
     
      //parse the string into Date object
      Date date = sdfSource.parse(strDate);
     
      //create SimpleDateFormat object with desired date format
      SimpleDateFormat sdfDestination = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
     
      //parse the date into another format
      strDate = sdfDestination.format(date);
     
      System.out.println("Date is converted from dd/MM/yy format to MM-dd-yyyy hh:mm:ss");
      System.out.println("Converted date is : " + strDate);
     
    }
    catch(ParseException pe)
    {
      System.out.println("Parse Exception : " + pe);
    }
  }
}

