package org.enes.Odev;

import java.util.Random;

public class Manager {
    int gunlerSayac;
    int iceceklerSayac;
    public Menu randomMenu(){
        Random random=new Random();
        if (gunlerSayac>6){
            gunlerSayac=0;
        }

        Menu menu=new Menu(EGunler.values()[gunlerSayac],
                ECorbalar.values()[random.nextInt(ECorbalar.values().length)],
                EYemekler.values()[random.nextInt(EYemekler.values().length)],
                ETatlilar.values()[random.nextInt(ETatlilar.values().length)],
                EIcecekler.values()[random.nextInt((EIcecekler.values().length))]);
        gunlerSayac++;
        return menu;
    }

    public Menu randomMenuIcecekHaric(){
        Random random=new Random();
        if (gunlerSayac>6){
            gunlerSayac=0;
        }
        if (iceceklerSayac>6) {
            iceceklerSayac=0;
        }

        Menu menu=new Menu(EGunler.values()[gunlerSayac],
                ECorbalar.values()[random.nextInt(ECorbalar.values().length)],
                EYemekler.values()[random.nextInt(EYemekler.values().length)],
                ETatlilar.values()[random.nextInt(ETatlilar.values().length)],
                EIcecekler.values()[iceceklerSayac]);
        gunlerSayac++;
        iceceklerSayac++;
        return menu;
    }
}
