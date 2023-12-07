package org.enes.lesson32;

import java.util.Scanner;

public class Utility {
    static Scanner sc=new Scanner(System.in);

    /**
     * int de�er alma metodu --> kullan�c�ya ne i�in de�er ald���n� g�stersin ve ald��� int de�er geri d�nd�rs�n
     */

    public static int intDegerAl(String sorgu){
        boolean kontrol=false;
        int value=0;
        do {
            try {
                System.out.println(sorgu);
                value=sc.nextInt();
                kontrol=false;
            }catch (Exception e){
                System.out.println(e.toString()+" : L�tfen bir say�sal de�er giriniz.");
                kontrol=true;
            }
            finally {
                sc.nextLine();
            }
        }while (kontrol);
        return value;
    }

    public static double doubleDegerAl(String sorgu){
        boolean kontrol=false;
        double value=0;
        do {
            try {
                System.out.println(sorgu);
                value=sc.nextDouble();
                kontrol=false;
            }catch (Exception e){
                System.out.println(e.toString()+" : L�tfen bir say�sal de�er giriniz.");
                kontrol=true;
            }
            finally {
                sc.nextLine();
            }
        }while (kontrol);
        return value;
    }

    public static long longDegerAl(String sorgu){
        boolean kontrol=false;
        long value=0;
        do {
            try {
                System.out.println(sorgu);
                value=sc.nextLong();
                kontrol=false;
            }catch (Exception e){
                System.out.println(e.toString()+" : L�tfen bir say�sal de�er giriniz.");
                kontrol=true;
            }
            finally {
                sc.nextLine();
            }
        }while (kontrol);
        return value;
    }

    public static String stringDegerAl(String sorgu){
        System.out.println(sorgu);
        return sc.nextLine();
    }

}
