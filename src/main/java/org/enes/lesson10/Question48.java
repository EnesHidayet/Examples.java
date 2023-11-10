package org.enes.lesson10;

import java.util.Scanner;

public class Question48 {
    /**
     * d��ar�dan girilen harf ile ba�layan illeri yazd�ral�m.
     */

    public static void main(String[] args) {

        String[] iller = { "Adana", "Ad�yaman", "Afyon", "A�r�", "Amasya", "Ankara", "Antalya", "Artvin", "Ayd�n",
                "Bal�kesir", "Bilecik", "Bing�l", "Bitlis", "Bolu", "Burdur", "Bursa", "�anakkale", "�ank�r�", "�orum",
                "Denizli", "Diyarbak�r", "Edirne", "Elaz��", "Erzincan", "Erzurum", "Eski�ehir", "Gaziantep", "Giresun",
                "G�m��hane", "Hakkari", "Hatay", "Isparta", "Mersin", "�stanbul", "�zmir", "Kars", "Kastamonu", "Kayseri",
                "K�rklareli", "K�r�ehir", "Kocaeli", "Konya", "K�tahya", "Malatya", "Manisa", "Kahramanmara�", "Mardin",
                "Mu�la", "Mu�", "Nev�ehir", "Ni�de", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
                "Tekirda�", "Tokat", "Trabzon", "Tunceli", "�anl�urfa", "U�ak", "Van", "Yozgat", "Zonguldak", "Aksaray",
                "Bayburt", "Karaman", "K�r�kkale", "Batman", "��rnak", "Bart�n", "Ardahan", "I�d�r", "Yalova", "Karab�k",
                "Kilis", "Osmaniye", "D�zce" };

        sehirBulmaca(iller);
        ilBul(iller);

    }
    public static void sehirBulmaca(String [] dizi){
        System.out.println("�stedi�iniz harfi giriniz...:");
        String ifade=new Scanner(System.in).nextLine();
        ifade=ifade.toUpperCase();

        for (int i=0;i<dizi.length;i++){
            if (ifade.equalsIgnoreCase(String.valueOf(dizi[i].charAt(0)))) {
                System.out.println(dizi[i]);
            }
        }

    }


    public static void ilBul(String [] dizi){
        System.out.println("�stedi�iniz harfi giriniz...:");
        String ifade=new Scanner(System.in).nextLine();
        ifade=ifade.toUpperCase();
        System.out.println(ifade.toUpperCase().substring(0,1)+" ile ba�layan iller");

        for (String il:dizi){
            if (il.startsWith((ifade.toUpperCase().substring(0,1)))){
                System.out.println(il);
            }
        }
    }



}
