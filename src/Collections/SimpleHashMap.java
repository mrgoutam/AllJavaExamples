/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Goutam
 */
public class SimpleHashMap {

    public static void main(String[] args) {
        HashMap<Integer, List<String>> hash = new HashMap();
        List<String> list = new ArrayList();
        list.add("Goutam");
        list.add("Mousam");
        list.add("Abhijit");

        List<String> list1 = new ArrayList();
        list1.add("Rudra");
        list1.add("Sahin");
        List<String> list2 = new ArrayList();
        list2.add("Sankriti");
        list2.add("Kalyani");
        list2.add("Shreya");
        list2.add("Oindrila");
        list2.add("Jhelum");
        list2.add("Pubali");
        list2.add("Arpita");
        list2.add("Shantanika");

        hash.put(1, list);
        hash.put(2, list1);
        hash.put(3, list2);

        System.out.println(hash.get(1));
        System.out.println(hash.get(2));
        System.out.println(hash.get(3));

    }
}
