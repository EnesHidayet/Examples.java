package org.enes.lesson10;

import java.util.Scanner;

public class Question48 {
    /**
     * dýþarýdan girilen harf ile baþlayan illeri yazdýralým.
     */

    public static void main(String[] args) {

        String[] iller = { "Adana", "Adýyaman", "Afyon", "Aðrý", "Amasya", "Ankara", "Antalya", "Artvin", "Aydýn",
                "Balýkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankýrý", "Çorum",
                "Denizli", "Diyarbakýr", "Edirne", "Elazýð", "Erzincan", "Erzurum", "Eskiþehir", "Gaziantep", "Giresun",
                "Gümüþhane", "Hakkari", "Hatay", "Isparta", "Mersin", "Ýstanbul", "Ýzmir", "Kars", "Kastamonu", "Kayseri",
                "Kýrklareli", "Kýrþehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraþ", "Mardin",
                "Muðla", "Muþ", "Nevþehir", "Niðde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
                "Tekirdað", "Tokat", "Trabzon", "Tunceli", "Þanlýurfa", "Uþak", "Van", "Yozgat", "Zonguldak", "Aksaray",
                "Bayburt", "Karaman", "Kýrýkkale", "Batman", "Þýrnak", "Bartýn", "Ardahan", "Iðdýr", "Yalova", "Karabük",
                "Kilis", "Osmaniye", "Düzce" };

        sehirBulmaca(iller);
        ilBul(iller);

    }
    public static void sehirBulmaca(String [] dizi){
        System.out.println("Ýstediðiniz harfi giriniz...:");
        String ifade=new Scanner(System.in).nextLine();
        ifade=ifade.toUpperCase();

        for (int i=0;i<dizi.length;i++){
            if (ifade.equalsIgnoreCase(String.valueOf(dizi[i].charAt(0)))) {
                System.out.println(dizi[i]);
            }
        }

    }


    public static void ilBul(String [] dizi){
        System.out.println("Ýstediðiniz harfi giriniz...:");
        String ifade=new Scanner(System.in).nextLine();
        ifade=ifade.toUpperCase();
        System.out.println(ifade.toUpperCase().substring(0,1)+" ile baþlayan iller");

        for (String il:dizi){
            if (il.startsWith((ifade.toUpperCase().substring(0,1)))){
                System.out.println(il);
            }
        }
    }



}
