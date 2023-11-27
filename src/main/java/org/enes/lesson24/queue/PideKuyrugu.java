package org.enes.lesson24.queue;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * String bir kuyruk oluþturacaðýz bir metod ile 10 tane müþteri ekleyeceðiz.
 * daha sonra random 1 ile 12 adet arasýnda bir pide üreteceðiz.
 *
 * daha sonra oluþmuþ kuyruða pideleri daðýtacaðýz.
 * pide bittiðinde pide kalmadý çýktýsý verelim.
 * eðer pide almayan varsa pide almayanlarýda yazdýralým.
 */

public class PideKuyrugu {

    Queue<String > pideKuyrugu=new ArrayBlockingQueue<>(10);
    Random random=new Random();
    int pideSayisi;


    public void musteriEkle(){
        for (int i=0;i<10;i++){
            pideKuyrugu.offer("Müþteri"+(i+1));
        }
    }

    public int pideSayisiBelirle(){
        this.pideSayisi=random.nextInt(1,5);
        return pideSayisi;
    }

    public void pideDagit(){
        pideSayisiBelirle();
        System.out.println("Pide sayýsý...:"+pideSayisi);
       for (int i=0;i<pideSayisi;i++){
           if (!pideKuyrugu.isEmpty()){
               String musteri=pideKuyrugu.poll();
               System.out.println(musteri+" pide aldý.");
           }else {
               System.out.println("Kalan pide sayisi...:"+(pideSayisi-(i)));
               break;
           }

        }

    }

    public void pideAlmayanlar(){
        if (!pideKuyrugu.isEmpty()){
            System.out.println("Pide bitti...Pide alamayan müþteriler");
            for (String musteri:pideKuyrugu){
                System.out.println(musteri);
            }
        }else {
            System.out.println("Pide alamayan kimse kalmadý.");
        }
    }
}
