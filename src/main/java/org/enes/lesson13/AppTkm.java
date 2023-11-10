package org.enes.lesson13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AppTkm {

    public String oyuncuAdi;
    public String [] secenekler={"TAÞ", "KAÐIT", "MAKAS"};
    public String secim;

    public String secimDon(){
        Scanner scanner=new Scanner(System.in);
        System.out.println(Arrays.toString(secenekler)+" seçeneklerinden birini seçiniz.");
        secim=scanner.nextLine();
        return secim.toUpperCase();
    }
    
    public String pcSecim(){

        Random random=new Random();
        int rastgele=random.nextInt(secenekler.length);
        return secenekler[rastgele];
    }


    public void uygulama(){
        System.out.println("Lütfen adýnýzý giriniz...");
        Scanner sc=new Scanner(System.in);
        oyuncuAdi=sc.nextLine();
        System.out.println(oyuncuAdi.toUpperCase()+" hoþgeldin taþ, kaðýt, makas oyunu baþlýyor...");
        String secim=secimDon();
        System.out.println("Seçimin "+secim);
        String pcSecim=pcSecim();
        System.out.println("Pc nin seçimi "+pcSecim);

        if (secim.equals(pcSecim)){
            System.out.println("Berabere kaldýnýz...");
        }else if (secim.equals("TAÞ") && pcSecim.equals("KAÐIT")) {
            System.out.println("Kaybettin...");
        }else if (secim.equals("TAÞ") && pcSecim.equals("MAKAS")){
            System.out.println("Kazandýn...");
        }else if (secim.equals("KAÐIT") && pcSecim.equals("MAKAS")) {
            System.out.println("Kaybettin...");
        }else if (secim.equals("KAÐIT") && pcSecim.equals("TAÞ")) {
            System.out.println("Kazandýn...");
        }else if (secim.equals("MAKAS") && pcSecim.equals("TAÞ")) {
            System.out.println("Kaybettin...");
        }else if (secim.equals("MAKAS") && pcSecim.equals("KAÐIT")) {
            System.out.println("Kazandýn...");
        }

    }


    public void uygulama2(){
        System.out.println("Lütfen adýnýzý giriniz...");
        Scanner sc=new Scanner(System.in);
        oyuncuAdi=sc.nextLine();
        System.out.println(oyuncuAdi.toUpperCase()+" hoþgeldin taþ, kaðýt, makas oyunu baþlýyor...");
        String secim=secimDon();
        System.out.println("Seçimin "+secim);
        String pcSecim=pcSecim();
        System.out.println("Pc nin seçimi "+pcSecim);

        if (secim.equals(pcSecim)){
            System.out.println("Berabere kaldýnýz...");
        }else{
            switch (secim){
                case "TAÞ":
                    if (pcSecim.equals("KAÐIT")){
                        System.out.println("Kaybettiniz...");
                    }else System.out.println("Kazandýnýz...");
                    break;

                case "KAÐIT":
                    if (pcSecim.equals("MAKAS")){
                        System.out.println("Kaybettiniz...");
                    }else System.out.println("Kazandýnýz...");
                    break;

                case "MAKAS":
                    if (pcSecim.equals("TAÞ")){
                        System.out.println("Kaybettiniz...");
                    }else System.out.println("Kazandýnýz...");
                    break;
            }
        }
    }




    

}
