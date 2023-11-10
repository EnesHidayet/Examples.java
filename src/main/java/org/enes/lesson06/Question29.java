package org.enes.lesson06;

import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {
        System.out.println("İban giriniz...:");

        Scanner sc=new Scanner(System.in);
        String iban=sc.nextLine();
        iban=iban.toUpperCase();
        if (iban.startsWith("TR")){
            if (iban.endsWith("5001")){
                System.out.println("Yurt içi işlemler Ziraat bankası");
            } else if (iban.endsWith("5002")) {
                System.out.println("Yurt içi işlemler Garanti bankası");
            }else if (iban.endsWith("5003")) {
                System.out.println("Yurt içi işlemler İş bankası");
            }else System.out.println("Yurt içi işlem");
        }else if (iban.startsWith("O")){
            if (iban.endsWith("2000")){
                System.out.println("Kıta içi "+iban.replace("OTH","Ki"));
            } else System.out.println("Kıta dışı "+iban.replace("OTH","Kd"));
        }else System.out.println("Hatalı iban");


    }
}
