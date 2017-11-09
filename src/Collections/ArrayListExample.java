/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;

/**
 *
 * @author Goutam
 */
public class ArrayListExample {
    public static void main(String args[]){
        ArrayList<String> arrL = new ArrayList<String>();
          arrL.add("Ajeet");
	  arrL.add("Harry");
	  arrL.add("Chaitanya");
	  arrL.add("Steve");
	  arrL.add("Anuj");
          
          System.out.println("Currently the array list has following elements:"+arrL);
          
          arrL.add(0,"Rahul");
          arrL.add(1, "Justin");
          System.out.println("Currently the array list has following elements:"+arrL);
          
          arrL.remove(1);
          System.out.println("Current array list is:"+arrL);
    }
}
