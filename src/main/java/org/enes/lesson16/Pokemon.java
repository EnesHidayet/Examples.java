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
    //const==> kurucu metot (new leme iþleminin yapýldýðý yer)
    //nesneyi oluþturan metot
    //eðer sýnýfýn içinde herhangi bir constructor yoksa default constructor (boþ constructor)
    //otomatik gelir oluþturmamýza gerek yoktur.
    //eðer baþka bir constructor varsa ve biz yinede boþ const ihtiyaç duyarsak boþ constructor oluþturmak zorundayýz


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
        System.out.println(ad+" adlý pokemon saldýrýda bulunuyor.");
    }

    public void kacinma(){
        System.out.println(ad+" adlý pokemon saldýrýdan kaçýnýyor.");
    }

    public void bilgileriGoster(){
        System.out.println("***************************");
        System.out.println("id..:"+id);
        System.out.println("ad..:"+ad);
        System.out.println("tür..:"+tur);
        System.out.println("can..:"+can);
        System.out.println("güç..:"+guc);
        System.out.println("seviye..:"+seviye);
        System.out.println("hediye puaný..:"+hediyePuan);
        System.out.println("***************************");
    }

}
