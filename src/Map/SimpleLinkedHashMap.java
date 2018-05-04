/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.LinkedHashMap;

/**
 *
 * @author Goutam
 */
public class SimpleLinkedHashMap {

    public static void main(String args[]) {
        //order is preserved
        //Operations on Map
        //put, get, containsKey, containsValue, remove, replace, isEmpty, size
        LinkedHashMap<String, String> mapContacts = new LinkedHashMap();
        mapContacts.put("0169238175", "Tom");
        mapContacts.put("0904891321", "Peter");
        mapContacts.put("0945678912", "Mary");
        mapContacts.put("0981127421", "John");

        System.out.println(mapContacts);

    }
}
