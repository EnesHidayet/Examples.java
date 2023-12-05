package org.enes.lesson26;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
        D��ar�dan giren bir kelimedeki tr karakteri eng karaktere �eviricez.
        bunu yaparlem arrayleri kullanmayaca��z arraylerden map olu�turup mapi kullanal�m.
 */
public class MapOrnek2 {
    public static void main(String[] args) {

        char[] turkishWords = { '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�' };
        char[] englishWords = { 'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O' };

        Map<Character,Character> harfler=new HashMap<>();

        for (int i=0;i<turkishWords.length;i++){
            harfler.put(turkishWords[i],englishWords[i]);
        }

        harfler.forEach((k,v)-> System.out.println(k+" = "+v));

        Scanner scanner=new Scanner(System.in);
        System.out.println("L�tfen kelime giriniz...:");
        String kelime=scanner.nextLine();
        String engKelime="";

        for (char harf:kelime.toCharArray()){
            if (harfler.containsKey(harf)){
                engKelime+=harfler.get(harf);
            }else {
                engKelime+=harf;
            }
        }

        System.out.println("Yeni hali...:"+engKelime);


    }
}
