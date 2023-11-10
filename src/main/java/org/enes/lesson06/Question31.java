package org.enes.lesson06;

import java.util.Scanner;

public class Question31 {
    public static void main(String[] args) {

        /**
         * dışarıdan giren kelimenin palindrom olup olmadığını kontrol edelim
         */

        System.out.println("Kelime giriniz");
        Scanner sc=new Scanner(System.in);
        String kelime=sc.nextLine();
        String kontrol="";
        for (int i=kelime.length()-1;i>=0;i--){

            char karakter=kelime.charAt(i);
            kontrol += karakter;

        }
        System.out.println("kelimenizin tersten yazımı...:"+kontrol);
        if (kelime.equals(kontrol)){
            System.out.println("Palindromdur");
        }else System.out.println("Palindrom değildir");


        System.out.println("2. ÇÖZÜM");

        boolean kontrol1=false;
        for (int i=0;i<kelime.length()/2;i++){

            if (kelime.charAt(i)!=kelime.charAt(kelime.length()-1-i)){
                kontrol1=false;
                break;
            }

        }
        if (true) {
            System.out.println("Palindromdur");
        }else System.out.println("Palindrom değildir");
    }
}
