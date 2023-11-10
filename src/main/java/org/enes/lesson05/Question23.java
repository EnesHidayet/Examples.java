package org.enes.lesson05;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        /**
         * bir kelime gireceğiz ve harfin başına index numarası gelecek şekilde alt alta yazdırıcaz
         */
        System.out.println("Kelime giriniz.");
        Scanner scanner=new Scanner(System.in);
        String girdi=scanner.nextLine();



        for (int i=0;i<girdi.length();i++){

            System.out.println(i+" "+girdi.charAt(i));

        }
    }
}
