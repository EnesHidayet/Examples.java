package org.enes.lesson17;

public class Calisanlar {
    public String ad;
    public String soyad;
    public String unvan;
    public double maas;

    public Calisanlar(String isim,String soyisim){
        this.ad=isim;
        this.soyad=soyisim;
    }

    public Calisanlar(String isim,String soyisim,double aylik){
        this.ad=isim;
        this.soyad=soyisim;
        this.maas=aylik;
    }

    public void bilgileriGoster(){
        System.out.println("********************");
        System.out.println("Ýsim...:"+ad);
        System.out.println("Soyisim...:"+soyad);
        System.out.println("Ünvaný...:"+unvan);
        System.out.println("Maaþý...:"+maas);
    }



    @Override
    public String toString() {
        return "Calisanlar{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", unvan='" + unvan + '\'' +
                ", maas=" + maas +
                '}';
    }


    public void zamYap(double oran){
        this.maas+=(maas*oran);
    }















}
