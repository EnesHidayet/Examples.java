package org.enes.lesson09;

import java.util.Random;
import java.util.Scanner;

public class Question45 {
    /**
     * Say� tahmin oyunu 5 adet hakk�m�z olsun
     * program ba�lang��ta bize bir rastgele say� versin 1 ile 750 aras�
     * hakk�m�z bitene kadar tahminde bulunal�m
     * e�er tahmin etti�imiz say� �retilen say�dan b�y�k ise tahmininizi azalt�n
     * e�er tahmin etti�imiz say� �retilen say�dan k���k ise tahmininizi artt�ral�m
     * e�er bir hakk�m�zda say�y� tahmin edebilmi�sek program sonlans�n
     * e�er edememi�sek ve hakk�m�z bitmi�se �zg�n�z tahmin hakk�n�z bitti ��kt�s� verelim
     * ve �nceki tahminlerimizi bir arrayde tutal�m oyunu sonunda da tahminleriniz diye yazd�ral�m
     */

    /*
    say� tahmin oyunu
    5 adet hakk�m�z olacak
    program baslang�cata bize rastgele bir say� �retecek (1 ile 750 aras� say� uretsin)
    hakk�m�z bitene kadar tahminde bulunacag�z
    eger tahmin etti�imiz sayi uretilen say�dan buyuk ise tahmininizi azalt�n
    eger tahmin etti�imiz sayi uretilen say�dan kucuk ise tahmininizi artt�ral�m
    eger bir hakk�m�zda say�y� tahmin edebilmi�sek program sonlans�n
    eger edememissek ve hakkm�z bitmi� ise bir uzgunuz tahmin hakk�n�z bitti diye bir c�kt� verelim
    ve �nce ki tahminlermizide bir arrayde tutal�m oyun sonunda da tahminleriniz diye yazd�ral�m

    */


    public static void main(String[] args) {


        int sayi=rastgeleSayi();

        sayiTahminOyunu(sayi);

    }// main


    public static int rastgeleSayi(){
        Random random=new Random();
        return random.nextInt(1,750);
    }


    public static void diziSayar(int [] dizi){
        for (int i=0;i<dizi.length;i++){
            System.out.println("��te tahminlerin...:"+(i+1)+". tahminin "+dizi[i]);
        }
    }



    public static void sayiTahminOyunu(int sayi){
        int [] sayilar=new int[5];
        int tahmin;

        for (int i=0;i<5;i++) {

            System.out.println("Akl�mdan bir say� tuttum l�tfen "+(i+1)+". tahmininizi giriniz.");
            tahmin=new Scanner(System.in).nextInt();
            sayilar[i]=tahmin;
            if (tahmin==sayi){
                System.out.println("Tebrikler akl�mdan tuttu�um sayi..."+tahmin+" idi "+ (i+1) + ". tahminde bildin...");
                diziSayar(sayilar);
                break;
            }else if (i==4){
                System.out.println("�zg�n�m tahmin hakk�n doldu akl�mdan tuttu�um say�...:"+sayi+" idi");
                diziSayar(sayilar);
            }else if (tahmin<sayi){
                System.out.println("Tahmininizi artt�r�n...");
            } else if (tahmin>sayi) {
                System.out.println("Tahmininizi azalt�n...");
            }

        }
    }




}//class
