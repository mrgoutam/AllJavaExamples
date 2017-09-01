/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionAndUtilPackage.Vector;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author Goutam
 */
public class MyVectorSubRange {
    public static void main(String a[]){
		Vector<String> vct = new Vector<String>();
		//adding elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		vct.add("Click");
		System.out.println("Actual vector:"+vct);
		List<String> list = vct.subList(2, 4);
		System.out.println("Sub List: "+list);
	}
}
