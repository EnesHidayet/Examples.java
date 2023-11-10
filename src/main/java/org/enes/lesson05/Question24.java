package org.enes.lesson05;

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {

        /**
         * 1-dışardıdan  bir kelime girelim kelime içerisinde a harfi kaç defa geçmiş bulalım
         * 2-dışarıdan giren harfi kontrol ettir
         *
         */

        System.out.println("Kelime giriniz...:");

        Scanner scanner=new Scanner(System.in);
        String kelime=scanner.nextLine();
        int asayisi=0;
        System.out.println("Aradığınız harfi girin");
        String harf=new Scanner(System.in).nextLine();

        for (int i=0;i<kelime.length();i++){

            if (kelime.charAt(i)==harf.charAt(0)){

                asayisi++;

            }

        }
        System.out.println(asayisi);



        System.out.println("2. çözüm**********");

            asayisi=0;
        for (int i=0;i<kelime.length();i++) {
            //chardan stringe çevirmek
            String value=Character.toString(kelime.charAt(i));
            String value2=String.valueOf(kelime.charAt(i));

            if (value.equalsIgnoreCase(harf)){
                asayisi++;
            }
        }
        System.out.println(asayisi);



    }
}
