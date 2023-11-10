package org.enes.lesson20.abstractOrnek3;

import java.util.Date;
import java.util.Scanner;

public class Manager  {

    public int menu(int secim){
        System.out.println("**** DATABASE MENÜSÜNE HOÞGELDÝNÝZ ****");
        System.out.println("1- VERÝ EKLE");
        System.out.println("2- VERÝ SÝL");
        System.out.println("3- VERÝ GÜNCELLE");
        System.out.println("4- VERÝLERÝ GETÝR");
        System.out.println("5- Ç I K I Þ");
        secim=new Scanner(System.in).nextInt();

        return secim;
    }



}
