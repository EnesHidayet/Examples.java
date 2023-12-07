package org.enes.lesson32;

/**
 * 1- Bir liman�n�z olacak bu limanda y�k yerle�tirilecek alanlar olacak limanda y�k yerle�tirilecek alanlar liman olu�tururken belirlenebilir veya standart her liman i�in
 * 10 adet y�k yeri olabilir.Her y�k�n bir a��rl��� kabul tarihi olacak (String)
 *
 * 2-Kendi exception enumumuzu yazal�m.
 * metot yazal�m yukYeriSec metodu olacak --> bu metot d��ar�dan bir y�k yeri se�imi alacak ve bu y�k yeri dolu ise y�k yeri dolu diye bir hata f�rlatacak.
 * bu metodu �al��t�rmadan �nce default olarak 2 yuk yerini elle doldural�m. daha sonra �al��t�ral�m.
 *
 * yukyersec2--> yuk yeri se�imi yapacak ve se�ti�i y�k yerinin int de�erini bize d�necek
 * yerle�tirme i�lemini bu metod yapmayacakt�r.!!!!! y�k yeri dolu ise hata f�rlats�n ayr�ca s�n�rlar�n d���nda bir de�er girilmi� ise
 * ba�ka bir hata f�rlats�n
 *
 * 3- A��rl�kBelirle --> liman�m�z 250 kg nin alt�n� kabul etmiyor. kullan�c�dan bir a��rl�k de�eri alal�m e�er 250 kg nin alt�ndaysa yetersiz a��rl�k
 * oldu�unu belirten bir hata f�rlatal�m.
 *
 * �DEV tarihBelileMetodu-->
 * a) girilen tarih bug�nden �ncemi �nce ise bir hata f�rlataca��z
 * b) Cumartesi ve pazar mesai saatleri d���ndad�r e�er
 */

public class Uygulama {
    private Liman liman;
    private final long GUN=24*60*60*1000;
    public Uygulama() {
        this.liman = new Liman();
        this.liman.getYukler()[0]=new Yuk("Hurda",11750,new MyDate(System.currentTimeMillis()-GUN,EGun.CARSAMBA));
        this.liman.getYukler()[1]=new Yuk("Bu�day",55000,new MyDate(System.currentTimeMillis()-2*GUN,EGun.SALI));
    }

    public MyDate tarihBelirleMetodu(MyDate date){

        if (date.getKabulGunu()==EGun.CUMARTESI || date.getKabulGunu()==EGun.PAZAR) {
            throw new LimanException(ErrorType.MESAI_DISI_GUN_HATASI);
        }else if (date.getKabulTarihi()!=System.currentTimeMillis() || date.getKabulGunu()!=EGun.CUMA){
            throw new LimanException(ErrorType.TARIH_BUGUN_DEGIL_HATASI);
        }

        System.out.println("Zaman uygun.");
        return date;
    }

    public void yukYeriSec(Yuk yuk){
        System.out.println("Bo� Yerler");
        for (int i = 0; i <liman.getYukler().length ; i++) {
            if (liman.getYukler()[i]==null){
                System.out.println((i+1)+" alan� secebilirsiniz");
            }
        }
        int index=Utility.intDegerAl("L�tfen bir yuk alan� seciniz");
        index=index-1;
        if (liman.getYukler()[index]==null){
            liman.getYukler()[index]=yuk;
            System.out.println("��lem ba�ar�l�");
        }else{
            throw new LimanException(ErrorType.DOLU_YER_SECIMI);
        }
    }

    public int yukYeriSec2(Yuk yuk){
        System.out.println("Bo� Yerler");
        for (int i = 0; i <liman.getYukler().length ; i++) {
            if (liman.getYukler()[i]==null){
                System.out.println((i+1)+" alan� secebilirsiniz");
            }
        }
        int index=Utility.intDegerAl("L�tfen bir yuk alan� seciniz");
        index=index-1;
        if (index<0 || index>liman.getAlanSayisi()){
            throw new LimanException(ErrorType.YUK_YERI_SINIR_HATASI);
        }
        if (liman.getYukler()[index]==null){
            return index;
        }else{
            throw new LimanException(ErrorType.DOLU_YER_SECIMI);
        }
    }

    public int yukYeriSec3(Yuk yuk){
        int index=Utility.intDegerAl("L�tfen bir yuk alan� seciniz");

            if (index>liman.getAlanSayisi() || index<0){
                throw new LimanException(ErrorType.YUK_YERI_SINIR_HATASI);
            }
            if (liman.getYukler()[index]!=null){
                throw new LimanException(ErrorType.DOLU_YER_SECIMI);
            }
        return index;
    }

    public double agirlikBelirle(){
        double agirlik=Utility.doubleDegerAl("Y�k�n a��rl���n� giriniz.");
        if (agirlik<250){
            throw new LimanException(ErrorType.DUSUK_AGIRLIK_HATASI);
        }
        return agirlik;
    }

    public static void main(String[] args) {
        Uygulama uygulama=new Uygulama();
//        int secim=uygulama.yukYeriSec3(new Yuk("Yuk3",uygulama.agirlikBelirle(),uygulama.tarihBelirleMetodu(new MyDate(System.currentTimeMillis(),EGun.CUMA))));
        Liman liman1=new Liman();
        liman1.getYukler()[3]=new Yuk("Yuk3",uygulama.agirlikBelirle(),uygulama.tarihBelirleMetodu(new MyDate(System.currentTimeMillis(),EGun.PERSEMBE)));
        for (int i=0;i<liman1.getYukler().length;i++){
            System.out.println(liman1.getYukler()[i]);
        }
//        System.out.println(secim);
    }
}

