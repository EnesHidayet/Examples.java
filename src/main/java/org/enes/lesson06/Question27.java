package org.enes.lesson06;

public class Question27 {
    public static void main(String[] args) {
        /**
         * bu string değeri virgullerden ayırın be kelimeyi alt alta yazdırın
         */
        String kelime="Java,React,Css,Html";


        for (int i=0;i<kelime.length();i++) {
            int loc1 = kelime.indexOf(",");
            if (loc1 != -1) {
                System.out.println(kelime.substring(0, loc1));
                kelime = kelime.substring(loc1 + 1);
            }
        }
        System.out.println(kelime);

        System.out.println("2. ÇÖZÜM");
        kelime="Java,React,Css,Html";
        int index=0;
        for (int i=0;i<kelime.length();i++){

            if (kelime.charAt(i)==','){
                System.out.println(kelime.substring(index,i));
                index=i+1;
            }

        }

        System.out.println(kelime.substring(index));

        System.out.println("3.ÇÖZÜM");

        for (int i=0;i<kelime.length();i++){

            if (kelime.charAt(i)==','){
                System.out.println();
            }else {
                System.out.print(kelime.charAt(i));
            }

        }

        System.out.println();
        System.out.println("4. ÇÖZÜM");
        kelime="Java,React,Css,Html";

        System.out.println(kelime.replace(",","\n"));


    }
}
