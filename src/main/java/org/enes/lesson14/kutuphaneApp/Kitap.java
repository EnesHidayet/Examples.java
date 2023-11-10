package org.enes.lesson14.kutuphaneApp;

public class Kitap {
    public int id;
    public String ad;
    public String turu;
    public String dil;
    public int sayfaSayisi;
    public String yazar;
    public String  basimTarihi;
    public String  yayinEvi;

    public void bilgileriGoster(){
        System.out.println("===Kitap Bilgileri==");
        System.out.println("id= "+id);
        System.out.println("kitap adý= "+ad);
        System.out.println("yazar ismi= "+yazar);
        System.out.println("tur= "+turu);
        System.out.println("sayfa sayisi= "+sayfaSayisi);
        System.out.println("basim Tarihi= "+basimTarihi);
        System.out.println("yayýn evi= "+yayinEvi);
        System.out.println("dil= "+dil);
    }


}
