/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Goutam
 */
public class SimpleTreeMap {

    public static void main(String args[]) {
        //order is preserved naturally that is alphabetically
        //Operations on Map
        //put, get, containsKey, containsValue, remove, replace, isEmpty, size
        Map<String, String> mapLang = new TreeMap<>();

        mapLang.put(".c", "C");
        mapLang.put(".java", "Java");
        mapLang.put(".pl", "Perl");
        mapLang.put(".cs", "C#");
        mapLang.put(".php", "PHP");
        mapLang.put(".cpp", "C++");
        mapLang.put(".xml", "XML");

        System.out.println(mapLang);

    }
}
