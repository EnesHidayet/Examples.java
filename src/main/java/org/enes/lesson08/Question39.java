package org.enes.lesson08;

import java.util.Scanner;

public class Question39 {
    public static void main(String[] args) {
 /*
 *
 * - Türkçe karakterleri inglizce karakterler çevirme
    'Ý', 'ý', 'þ', 'Þ', 'ç', 'Ç', 'ð', 'Ð', 'ü', 'Ü', 'ö', 'Ö'
	dýaþýrýdan bir kelime alacagýz
	bu kelime içerisinde geçen türkçe karakterleri ing karakterlere dönüþtüreceðiz ;
 *
 */
        System.out.println("Kelimeyi giriniz...:");
        String kelime=new Scanner(System.in).nextLine();
        Character [] turkce= {'Ý','ý', 'þ', 'Þ', 'ç', 'Ç', 'ð', 'Ð', 'ü', 'Ü', 'ö', 'Ö'};
        Character [] ingilizce= {'I','i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O'};


        for (int i=0;i<turkce.length;i++){

            kelime=kelime.replace(turkce[i],ingilizce[i]);

        }
        System.out.println("Kelime...:"+kelime);





    }
}
