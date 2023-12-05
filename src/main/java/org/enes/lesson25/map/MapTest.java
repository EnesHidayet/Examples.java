package org.enes.lesson25.map;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
//        Map<String,String> map1=new TreeMap<>();
//        Map<String,String> map2=new LinkedHashMap<>();

        map.put("06","Ankara");
        map.put("05","Amasya");
        map.put("08","Artvin");
        map.put("08","Antalya"); // son ekleneni verir.

        // plakasý 06 olan þehrin ismini nasýl yazdýrýrým?

        System.out.println(map.get("08"));
        map.replace("06","ANKARA");
        System.out.println(map.get("06"));

        //key deðerleri içerisinde 06 var mý

        System.out.println(map.containsKey("06"));
        System.out.println(map.containsKey("09"));

        //value deðerleri içerisinde Amasya var mý

        System.out.println(map.containsValue("Amasya"));
        System.out.println(map.containsValue("Afyon"));

        //map yazdýrma.

        map.forEach((k,v)-> System.out.println(k+" "+v));

        System.out.println(map);// bu yolda pek istenilen tarzda deðil

        // bu biraz uzun bir yol yazdýrma için
        Set<String> keySet=map.keySet();
        for (String key:keySet){
            System.out.println(key+" "+map.get(key));
        }

        //bu da biraz daha uzun.
        Set<Map.Entry<String ,String>> entry=map.entrySet();
        for (Map.Entry<String,String > entry1 :entry){
            System.out.println(entry1.getKey()+" "+entry1.getValue());
        }

        System.out.println("********************************************");

        Map<Integer,String> map2=new TreeMap<>();
        map2.put(1,"Enes");
        map2.put(3,"Hidayet");
        map2.put(2,"ASLAN");

        map2.forEach((k,v) -> System.out.println(k+" "+v));

    }
}
