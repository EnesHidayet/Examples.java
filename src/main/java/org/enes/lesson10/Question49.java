package org.enes.lesson10;

import java.util.Scanner;

public class Question49 {
    /**
     1- d�sar�dan girilen harfle baslayan illeri yazd�ral�m;
     2- illeri plaka kodlar� ile yazd�ral�m 01-Adana 02-Ad�yaman .....
     3- girdi�imiz sehrin ismine gore plaka kodu donen metot yazal�m
     4- ilk harf haric sesli harflari slip yazd�ran bir fonksiyon yazal�m ( bir arraye atayal�m) ==>Adn ,Adymn
     5- bir onceki metotdan donen degerlerin ilk uc harfini als�n ve sonuna ...(�� tane nokta eklesin)
     Adn... Ady...
     6- bir �nceki metotdan donen dizide B ile ba�layan illerine ba��na s�ra no 1-Blk 2-Bl
     7- ikinci harfi a olanlar�n ilk degerini ve sadece ilk 3 harfini yazd�r�n (�ank�r�==>�an)
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
        System.out.println("�stedi�iniz harfi giriniz...:");
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
        System.out.println("�stedi�iniz harfi giriniz...:");
        String ifade=new Scanner(System.in).nextLine();
        ifade=ifade.toUpperCase();
        System.out.println(ifade.toUpperCase().substring(0,1)+" ile ba�layan iller");
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

        System.out.println("Arad���n�z plaka kodu i�in �ehir giriniz...:");
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
        String [] sesli={"a","e","i","�","o","�","u","�"};
        int i=0;
        for (String kelime:dizi){
            String yeniKelime=kelime.replaceAll("[aeo�u��i]","");
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
