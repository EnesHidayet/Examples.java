package org.enes.lesson08;

import java.util.Scanner;

public class Question39 {
    public static void main(String[] args) {
 /*
 *
 * - T�rk�e karakterleri inglizce karakterler �evirme
    '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�'
	d�a��r�dan bir kelime alacag�z
	bu kelime i�erisinde ge�en t�rk�e karakterleri ing karakterlere d�n��t�rece�iz ;
 *
 */
        System.out.println("Kelimeyi giriniz...:");
        String kelime=new Scanner(System.in).nextLine();
        Character [] turkce= {'�','�', '�', '�', '�', '�', '�', '�', '�', '�', '�', '�'};
        Character [] ingilizce= {'I','i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O'};


        for (int i=0;i<turkce.length;i++){

            kelime=kelime.replace(turkce[i],ingilizce[i]);

        }
        System.out.println("Kelime...:"+kelime);





    }
}
