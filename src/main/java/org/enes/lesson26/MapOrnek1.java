package org.enes.lesson26;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
   dýþarýdan bir kelime alacaðýz
   merhaba
   her bir harfin frekansýný ( kelime içinde kaç kere geçtiðini) bulacaðýz ve bir map yapýsý içinde tutacaðýz.
   m=1
   e=1
   r=1
   h=1
   a=2
   b=1
 */
public class MapOrnek1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir kelime giriniz...");
        String kelime=scanner.nextLine();
        kelime=kelime.toLowerCase();
        Map<Character,Integer> frekans=new HashMap<>();

//        for (char harf:kelime.toCharArray()){
//            frekans.put(harf,frekans.getOrDefault(harf,0)+1);
//        }
//
//        frekans.forEach((k,v)-> System.out.println(k+"="+v));

        for (char harf:kelime.toCharArray()){
            if (frekans.containsKey(harf)){
                frekans.replace(harf,frekans.get(harf)+1);
//                frekans.put(harf,frekans.get(harf)+1); // ayný iþlemi put ilede yapabiliriz.
            }else {
                frekans.put(harf,1);
            }
        }

        frekans.forEach((k,v)-> System.out.println(k+"="+v));

    }
}
