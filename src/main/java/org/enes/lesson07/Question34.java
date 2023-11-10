package org.enes.lesson07;

import java.util.Scanner;

public class Question34 {
    public static void main(String[] args) {

        /**
         * kullanýcýdan bir ülke ismi alacaðýz daha sonra bu ülke ismini arrayde varsa girdiðiniz ülke bulundu yoksa girdiðiniz ülke bulunumadý yaz
         */
        String [] dizi={"Türkiye","Japonya","Danimarka","Fransa"};
        System.out.println("Bir ülke ismi giriniz...:");
        Scanner sc=new Scanner(System.in);
        String ulke=sc.nextLine();
        boolean kontrol=false;

        for (int i=0;i<dizi.length;i++){

            if (ulke.equalsIgnoreCase(dizi[i])) {
               kontrol=true; break;
            }

        }
        if (kontrol){
            System.out.println("Ülke bulundu...");
        }else System.out.println("Ülke bulunamadý...");




    }
}
