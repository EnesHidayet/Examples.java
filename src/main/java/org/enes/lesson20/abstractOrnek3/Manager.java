package org.enes.lesson20.abstractOrnek3;

import java.util.Date;
import java.util.Scanner;

public class Manager  {

    public int menu(int secim){
        System.out.println("**** DATABASE MEN�S�NE HO�GELD�N�Z ****");
        System.out.println("1- VER� EKLE");
        System.out.println("2- VER� S�L");
        System.out.println("3- VER� G�NCELLE");
        System.out.println("4- VER�LER� GET�R");
        System.out.println("5- � I K I �");
        secim=new Scanner(System.in).nextInt();

        return secim;
    }



}
