package org.enes.lesson24;

import java.util.Random;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        TabakManager tabakManager=new TabakManager();
        tabakManager.tabakOlustur();
        tabakManager.getKirliler().forEach(System.out::println);
        System.out.println("/////////////////////////////////////////");
        tabakManager.getTemizler().forEach(System.out::println);

        Thread.sleep(3000);

     //50 kere secim yap metodunu çalıştıralım ve seçimler random olsun.
        Random random=new Random();
        for (int i=0;i<50;i++){
            int secim= random.nextInt(1,3);
            tabakManager.secimYap(secim);
            Thread.sleep(1500);
        }
    }
}
