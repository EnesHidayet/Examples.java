package org.enes.lesson20.abstractOrnek;

public class ElektrikPokemonu extends Pokemon {


    public ElektrikPokemonu(String ad,int can,int guc,int seviye){
        tur="Elektrik";
        this.ad=ad;
        this.can=can;
        this.guc=guc;
        this.seviye=seviye;
    }

    @Override
    public void ozelSadldiriYap() {
        System.out.println("Elektrik pokemon �zel sald�r� yap�yor.");
    }

//    public ElektrikPokemonu(String ad,int can,int guc,int seviye){
//        super(ad,can,guc,seviye);
//        tur="Elektrik";
//    }


}
