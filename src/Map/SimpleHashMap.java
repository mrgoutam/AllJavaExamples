/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Goutam
 */
public class SimpleHashMap {

    public static void main(String args[]) {
        //order is not preserved
        //Operations on Map
        //put, get, containsKey, containsValue, remove, replace, isEmpty, size
        //Iterating Over a Map (using Collection views)
        //keySet(), values(), EntrySet(), forEach()
        //Bulk operation: clear(), putAll()
        //concurrent map
        HashMap<Integer, String> mapHttpErrors = new HashMap();
        mapHttpErrors.put(200, "OK");
        mapHttpErrors.put(303, "See Other");
        mapHttpErrors.put(404, "Not Found");
        mapHttpErrors.put(500, "Internal Server Error");

        System.out.println(mapHttpErrors);

        String status301 = mapHttpErrors.get(303);
        System.out.println("303: " + status301);

        System.out.println(mapHttpErrors);

        if (mapHttpErrors.containsKey(200)) {
            System.out.println("Http status 200");
        }

        if (mapHttpErrors.containsValue("OK")) {
            System.out.println("Found status OK");
        }

        String removedValue = mapHttpErrors.remove(500);

        if (removedValue != null) {
            System.out.println("Removed value: " + removedValue);
        }

        System.out.println(mapHttpErrors);

        mapHttpErrors.replace(303, "No Changes");

        int size = mapHttpErrors.size();
        System.out.println("Size is: " + size);

        if (mapHttpErrors.isEmpty()) {
            System.out.println("No Error");
        } else {
            System.out.println("Have HTTP Errors");
        }

        //returns a Set view of the keys contained in the map. Hence we can iterate over the keys of the map
        Map<String, String> mapCountryCodes = new HashMap<>();
        mapCountryCodes.put("1", "USA");
        mapCountryCodes.put("44", "United Kingdom");
        mapCountryCodes.put("33", "France");
        mapCountryCodes.put("81", "Japan");

        Set<String> setCodes = mapCountryCodes.keySet();
        Iterator<String> iterator = setCodes.iterator();

        while (iterator.hasNext()) {
            String code = iterator.next();
            String country = mapCountryCodes.get(code);

            System.out.println(code + " => " + country);
        }

        //returns a collection of values contained in the map. Thus we can iterate over values of the map
        Collection<String> countries = mapCountryCodes.values();
        for (String country : countries) {
            System.out.println(country);
        }

        //returns a Set view of the mappings contained in this map. Therefore we can iterate over mappings in the map
        Set<Map.Entry<String, String>> entries = mapCountryCodes.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String code = entry.getKey();
            String country = entry.getValue();

            System.out.println(code + " => " + country);
        }

        //applicable for java 8
        mapCountryCodes.forEach((code, country) -> System.out.println(code + " => " + country));

        //Bulk Operation
        //clear
        mapHttpErrors.clear();
        System.out.println("Is map empty? " + mapHttpErrors.isEmpty());
        
        
        
        //putAll()
        Map<Integer, String> countryCodesEU = new HashMap<>();

        countryCodesEU.put(44, "United Kingdom");
        countryCodesEU.put(33, "France");
        countryCodesEU.put(49, "Germany");

        Map<Integer, String> countryCodesWorld = new HashMap<>();

        countryCodesWorld.put(1, "United States");
        countryCodesWorld.put(86, "China");
        countryCodesWorld.put(82, "South Korea");

        System.out.println("Before: " + countryCodesWorld);

        countryCodesWorld.putAll(countryCodesEU);

        System.out.println("After: " + countryCodesWorld);
    }
}
