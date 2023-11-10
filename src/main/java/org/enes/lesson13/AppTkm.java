package org.enes.lesson13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AppTkm {

    public String oyuncuAdi;
    public String [] secenekler={"TA�", "KA�IT", "MAKAS"};
    public String secim;

    public String secimDon(){
        Scanner scanner=new Scanner(System.in);
        System.out.println(Arrays.toString(secenekler)+" se�eneklerinden birini se�iniz.");
        secim=scanner.nextLine();
        return secim.toUpperCase();
    }
    
    public String pcSecim(){

        Random random=new Random();
        int rastgele=random.nextInt(secenekler.length);
        return secenekler[rastgele];
    }


    public void uygulama(){
        System.out.println("L�tfen ad�n�z� giriniz...");
        Scanner sc=new Scanner(System.in);
        oyuncuAdi=sc.nextLine();
        System.out.println(oyuncuAdi.toUpperCase()+" ho�geldin ta�, ka��t, makas oyunu ba�l�yor...");
        String secim=secimDon();
        System.out.println("Se�imin "+secim);
        String pcSecim=pcSecim();
        System.out.println("Pc nin se�imi "+pcSecim);

        if (secim.equals(pcSecim)){
            System.out.println("Berabere kald�n�z...");
        }else if (secim.equals("TA�") && pcSecim.equals("KA�IT")) {
            System.out.println("Kaybettin...");
        }else if (secim.equals("TA�") && pcSecim.equals("MAKAS")){
            System.out.println("Kazand�n...");
        }else if (secim.equals("KA�IT") && pcSecim.equals("MAKAS")) {
            System.out.println("Kaybettin...");
        }else if (secim.equals("KA�IT") && pcSecim.equals("TA�")) {
            System.out.println("Kazand�n...");
        }else if (secim.equals("MAKAS") && pcSecim.equals("TA�")) {
            System.out.println("Kaybettin...");
        }else if (secim.equals("MAKAS") && pcSecim.equals("KA�IT")) {
            System.out.println("Kazand�n...");
        }

    }


    public void uygulama2(){
        System.out.println("L�tfen ad�n�z� giriniz...");
        Scanner sc=new Scanner(System.in);
        oyuncuAdi=sc.nextLine();
        System.out.println(oyuncuAdi.toUpperCase()+" ho�geldin ta�, ka��t, makas oyunu ba�l�yor...");
        String secim=secimDon();
        System.out.println("Se�imin "+secim);
        String pcSecim=pcSecim();
        System.out.println("Pc nin se�imi "+pcSecim);

        if (secim.equals(pcSecim)){
            System.out.println("Berabere kald�n�z...");
        }else{
            switch (secim){
                case "TA�":
                    if (pcSecim.equals("KA�IT")){
                        System.out.println("Kaybettiniz...");
                    }else System.out.println("Kazand�n�z...");
                    break;

                case "KA�IT":
                    if (pcSecim.equals("MAKAS")){
                        System.out.println("Kaybettiniz...");
                    }else System.out.println("Kazand�n�z...");
                    break;

                case "MAKAS":
                    if (pcSecim.equals("TA�")){
                        System.out.println("Kaybettiniz...");
                    }else System.out.println("Kazand�n�z...");
                    break;
            }
        }
    }




    

}
