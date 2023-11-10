package org.enes.lesson20.enums;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakasApp {
    public static void main(String[] args) {

        oyun();

    }

    public static void oyun(){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        ESecenek [] secenekler=ESecenek.values();
        for (ESecenek secenek:secenekler){
            System.out.println((secenek.ordinal()+1)+" - "+secenek.name());
        }
        System.out.println("L�tfen se�im yap�n�z.");
        int index=scanner.nextInt()-1;
        ESecenek secim=secenekler[index];
        ESecenek pcSecim=secenekler[random.nextInt(secenekler.length)];
        System.out.println("Pc se�imi...:"+pcSecim);

        if (pcSecim==secim){
            System.out.println("Beraberlik.");
        }else if (secim.kazanan.equalsIgnoreCase(pcSecim.name())){
            System.out.println("Kazand�n�z.");
        }else {
            System.out.println("Kaybettiniz.");
        }
    }
}
