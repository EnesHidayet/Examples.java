package org.enes.lesson10;

import java.util.Scanner;

public class Question49 {
    /**
     1- dýsarýdan girilen harfle baslayan illeri yazdýralým;
     2- illeri plaka kodlarý ile yazdýralým 01-Adana 02-Adýyaman .....
     3- girdiðimiz sehrin ismine gore plaka kodu donen metot yazalým
     4- ilk harf haric sesli harflari slip yazdýran bir fonksiyon yazalým ( bir arraye atayalým) ==>Adn ,Adymn
     5- bir onceki metotdan donen degerlerin ilk uc harfini alsýn ve sonuna ...(üç tane nokta eklesin)
     Adn... Ady...
     6- bir önceki metotdan donen dizide B ile baþlayan illerine baþýna sýra no 1-Blk 2-Bl
     7- ikinci harfi a olanlarýn ilk degerini ve sadece ilk 3 harfini yazdýrýn (Çankýrý==>Çan)
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
        plakaBul(iller);

        String[] ssz=sessiz(iller);
        for (int i=0;i< iller.length;i++){
            System.out.println(ssz[i]);
        }

        String[] nokta=ucNokta(ssz);
        for (int j=0;j<nokta.length;j++){
            System.out.println(nokta[j]);
        }


        bIleBaslarsa(nokta);
        ilkUc(iller);








    }

    //1. soru
    public static void sehirBulmaca(String [] dizi){
        System.out.println("Ýstediðiniz harfi giriniz...:");
        String ifade=new Scanner(System.in).nextLine();
        ifade=ifade.substring(0,1).toUpperCase();

        for (int i=0;i<dizi.length;i++){
            if (ifade.equalsIgnoreCase(String.valueOf(dizi[i].charAt(0)))) {
                if (i>10){
                System.out.println((i+1)+" - "+dizi[i]);
                } else if (i<=10) {

                    System.out.println("0"+(i+1)+" - "+dizi[i]);
                }
            }
        }

    }

    //2. soru
    public static void ilBul(String [] dizi){
        System.out.println("Ýstediðiniz harfi giriniz...:");
        String ifade=new Scanner(System.in).nextLine();
        ifade=ifade.toUpperCase();
        System.out.println(ifade.toUpperCase().substring(0,1)+" ile baþlayan iller");
        int i=1;
        for (String il:dizi){
            if (il.startsWith((ifade.toUpperCase().substring(0,1)))){
                if (i>=10) {
                    System.out.println(i+" - "+il);
                } else if (i<9) {
                    System.out.println("0"+i+" - "+il);
                }
            }
            i++;
        }
    }

    //3. soru
    public static void plakaBul (String[] dizi){

        System.out.println("Aradýðýnýz plaka kodu için þehir giriniz...:");
        String input=new Scanner(System.in).nextLine();

        for (int i=0;i<dizi.length;i++){
            if (dizi[i].equalsIgnoreCase(input)){
                if (i<9){
                    System.out.println(input.toUpperCase()+" Plaka kodu 0"+(i+1));
                    break;
                }else{
                    System.out.println(input.toUpperCase()+" Plaka kodu "+(i+1));
                    break;
                }
            }
        }

    }

    //4. soru
    public static String [] sessiz (String [] dizi){
        String [] sessiz=new String[dizi.length];
        String [] sesli={"a","e","i","ý","o","ö","u","ü"};
        int i=0;
        for (String kelime:dizi){
            String yeniKelime=kelime.replaceAll("[aeoöuüýi]","");
            sessiz[i]=yeniKelime;
            i++;
        }
        return sessiz;
    }

    //5. soru
    public static String [] ucNokta(String [] dizi) {
        String[] yeni = new String[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i].length() < 3) {
                yeni[i] = dizi[i] + "...";
            } else if (dizi[i].length() >= 3) {

                dizi[i] = dizi[i].substring(0, 3);
                yeni[i] = dizi[i] + "...";

            }
        }
        return yeni;
    }



    //6. soru
    public static void bIleBaslarsa(String [] dizi){
        int sayac=1;
        for (int i=0;i<dizi.length;i++){
            if (dizi[i].startsWith("B")){
                System.out.println(sayac+"-"+dizi[i]);
                sayac++;
            }
        }
    }

    //7. soru
    public static void ilkUc(String [] dizi){
        for (int i=0;i< dizi.length;i++){
            if (dizi[i].charAt(1)=='a'){
                System.out.println(dizi[i].substring(0,3));
            }else System.out.println(dizi[i]);

        }
    }










}
