package org.enes.lesson20.enums;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println(EAylar.EYLUL);
        EAylar ay1=EAylar.AGUSTOS;
        System.out.println(ay1);
        String ay2=ay1.toString();
        System.out.println(ay2);
        String ay3=ay1.name();
        System.out.println(ay3);
        System.out.println(EAylar.HAZIRAN.ordinal());
        System.out.println(EAylar.TEMMUZ.ordinal());
        System.out.println(EAylar.AGUSTOS.ordinal());
        System.out.println(EAylar.EYLUL.ordinal());

        EAylar [] aylar=EAylar.values();

        for (EAylar eAylar:aylar){
            System.out.println(eAylar.ordinal()+" - "+eAylar.name()+"====>"+eAylar.getGunSayisi()+" - "+eAylar.getMevsim());
        }

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir ay giriniz...");
        String ay4=scanner.nextLine();
        EAylar aylar1=EAylar.valueOf(ay4);
        System.out.println(aylar1);

    }
}
