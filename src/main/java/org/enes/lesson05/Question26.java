package org.enes.lesson05;

import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {

        /**
         * dışarıdan bir metin girelim daha sonra bu metinin tersini yazdıralım.
         * java avaj
         */
        System.out.println("Metin giriniz");
        Scanner sc=new Scanner(System.in);
        String metin=sc.nextLine();

        for (int i=metin.length()-1;i>=0;i--){
            System.out.print(metin.charAt(i));
        }


    }
}
