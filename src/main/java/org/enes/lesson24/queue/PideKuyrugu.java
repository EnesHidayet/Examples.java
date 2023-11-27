package org.enes.lesson24.queue;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * String bir kuyruk olu�turaca��z bir metod ile 10 tane m��teri ekleyece�iz.
 * daha sonra random 1 ile 12 adet aras�nda bir pide �retece�iz.
 *
 * daha sonra olu�mu� kuyru�a pideleri da��taca��z.
 * pide bitti�inde pide kalmad� ��kt�s� verelim.
 * e�er pide almayan varsa pide almayanlar�da yazd�ral�m.
 */

public class PideKuyrugu {

    Queue<String > pideKuyrugu=new ArrayBlockingQueue<>(10);
    Random random=new Random();
    int pideSayisi;


    public void musteriEkle(){
        for (int i=0;i<10;i++){
            pideKuyrugu.offer("M��teri"+(i+1));
        }
    }

    public int pideSayisiBelirle(){
        this.pideSayisi=random.nextInt(1,5);
        return pideSayisi;
    }

    public void pideDagit(){
        pideSayisiBelirle();
        System.out.println("Pide say�s�...:"+pideSayisi);
       for (int i=0;i<pideSayisi;i++){
           if (!pideKuyrugu.isEmpty()){
               String musteri=pideKuyrugu.poll();
               System.out.println(musteri+" pide ald�.");
           }else {
               System.out.println("Kalan pide sayisi...:"+(pideSayisi-(i)));
               break;
           }

        }

    }

    public void pideAlmayanlar(){
        if (!pideKuyrugu.isEmpty()){
            System.out.println("Pide bitti...Pide alamayan m��teriler");
            for (String musteri:pideKuyrugu){
                System.out.println(musteri);
            }
        }else {
            System.out.println("Pide alamayan kimse kalmad�.");
        }
    }
}
