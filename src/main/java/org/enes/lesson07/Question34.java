package org.enes.lesson07;

import java.util.Scanner;

public class Question34 {
    public static void main(String[] args) {

        /**
         * kullan�c�dan bir �lke ismi alaca��z daha sonra bu �lke ismini arrayde varsa girdi�iniz �lke bulundu yoksa girdi�iniz �lke bulunumad� yaz
         */
        String [] dizi={"T�rkiye","Japonya","Danimarka","Fransa"};
        System.out.println("Bir �lke ismi giriniz...:");
        Scanner sc=new Scanner(System.in);
        String ulke=sc.nextLine();
        boolean kontrol=false;

        for (int i=0;i<dizi.length;i++){

            if (ulke.equalsIgnoreCase(dizi[i])) {
               kontrol=true; break;
            }

        }
        if (kontrol){
            System.out.println("�lke bulundu...");
        }else System.out.println("�lke bulunamad�...");




    }
}
