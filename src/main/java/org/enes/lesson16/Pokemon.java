package org.enes.lesson16;

import java.util.Random;

public class Pokemon {

    public int id;
    public String tur;
    public String ad;
    public int seviye;
    public int can;
    public int guc;
    public int hediyePuan;

    //default constructor
    //const==> kurucu metot (new leme i�leminin yap�ld��� yer)
    //nesneyi olu�turan metot
    //e�er s�n�f�n i�inde herhangi bir constructor yoksa default constructor (bo� constructor)
    //otomatik gelir olu�turmam�za gerek yoktur.
    //e�er ba�ka bir constructor varsa ve biz yinede bo� const ihtiya� duyarsak bo� constructor olu�turmak zorunday�z


    public Pokemon(){

        this.hediyePuan=120;
        this.id= new Random().nextInt(0,100);

    }

    public Pokemon(String isim ){
        this();
        ad=isim;
//        this.hediyePuan=120;
//        this.id= new Random().nextInt(0,100);

    }

    public Pokemon(String ad,int can,int guc,int seviye){
        this(ad);
        this.can=can;
        this.guc=guc;
        this.seviye=seviye;
        this.hediyePuan=120;
    }


    public Pokemon(int myId,String isim,String cesit,int hp,int vurusGucu,int level){
        this(cesit,isim,level,hp,vurusGucu);
        id=myId;
//        ad=isim;
//        tur=cesit;
//        can=hp;
//        guc=vurusGucu;
//        seviye=level;
//        this.hediyePuan=120;
    }

    public Pokemon(String ad,String tur,int can,int guc,int seviye) {
//        this();
        this(ad);
//        this.ad=ad;
        this.tur=tur;
        this.can=can;
        this.guc=guc;
        this.seviye=seviye;
        this.hediyePuan=120;
//        this.id= new Random().nextInt(0,100);
    }

    public void saldiri(){
        System.out.println(ad+" adl� pokemon sald�r�da bulunuyor.");
    }

    public void kacinma(){
        System.out.println(ad+" adl� pokemon sald�r�dan ka��n�yor.");
    }

    public void bilgileriGoster(){
        System.out.println("***************************");
        System.out.println("id..:"+id);
        System.out.println("ad..:"+ad);
        System.out.println("t�r..:"+tur);
        System.out.println("can..:"+can);
        System.out.println("g��..:"+guc);
        System.out.println("seviye..:"+seviye);
        System.out.println("hediye puan�..:"+hediyePuan);
        System.out.println("***************************");
    }

}
