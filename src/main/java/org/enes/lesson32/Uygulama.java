package org.enes.lesson32;

/**
 * 1- Bir limanýnýz olacak bu limanda yük yerleþtirilecek alanlar olacak limanda yük yerleþtirilecek alanlar liman oluþtururken belirlenebilir veya standart her liman için
 * 10 adet yük yeri olabilir.Her yükün bir aðýrlýðý kabul tarihi olacak (String)
 *
 * 2-Kendi exception enumumuzu yazalým.
 * metot yazalým yukYeriSec metodu olacak --> bu metot dýþarýdan bir yük yeri seçimi alacak ve bu yük yeri dolu ise yük yeri dolu diye bir hata fýrlatacak.
 * bu metodu çalýþtýrmadan önce default olarak 2 yuk yerini elle dolduralým. daha sonra çalýþtýralým.
 *
 * yukyersec2--> yuk yeri seçimi yapacak ve seçtiði yük yerinin int deðerini bize dönecek
 * yerleþtirme iþlemini bu metod yapmayacaktýr.!!!!! yük yeri dolu ise hata fýrlatsýn ayrýca sýnýrlarýn dýþýnda bir deðer girilmiþ ise
 * baþka bir hata fýrlatsýn
 *
 * 3- AðýrlýkBelirle --> limanýmýz 250 kg nin altýný kabul etmiyor. kullanýcýdan bir aðýrlýk deðeri alalým eðer 250 kg nin altýndaysa yetersiz aðýrlýk
 * olduðunu belirten bir hata fýrlatalým.
 *
 * ÖDEV tarihBelileMetodu-->
 * a) girilen tarih bugünden öncemi önce ise bir hata fýrlatacaðýz
 * b) Cumartesi ve pazar mesai saatleri dýþýndadýr eðer
 */

public class Uygulama {
    private Liman liman;
    private final long GUN=24*60*60*1000;
    public Uygulama() {
        this.liman = new Liman();
        this.liman.getYukler()[0]=new Yuk("Hurda",11750,new MyDate(System.currentTimeMillis()-GUN,EGun.CARSAMBA));
        this.liman.getYukler()[1]=new Yuk("Buðday",55000,new MyDate(System.currentTimeMillis()-2*GUN,EGun.SALI));
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
        System.out.println("Boþ Yerler");
        for (int i = 0; i <liman.getYukler().length ; i++) {
            if (liman.getYukler()[i]==null){
                System.out.println((i+1)+" alaný secebilirsiniz");
            }
        }
        int index=Utility.intDegerAl("Lütfen bir yuk alaný seciniz");
        index=index-1;
        if (liman.getYukler()[index]==null){
            liman.getYukler()[index]=yuk;
            System.out.println("Ýþlem baþarýlý");
        }else{
            throw new LimanException(ErrorType.DOLU_YER_SECIMI);
        }
    }

    public int yukYeriSec2(Yuk yuk){
        System.out.println("Boþ Yerler");
        for (int i = 0; i <liman.getYukler().length ; i++) {
            if (liman.getYukler()[i]==null){
                System.out.println((i+1)+" alaný secebilirsiniz");
            }
        }
        int index=Utility.intDegerAl("Lütfen bir yuk alaný seciniz");
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
        int index=Utility.intDegerAl("Lütfen bir yuk alaný seciniz");

            if (index>liman.getAlanSayisi() || index<0){
                throw new LimanException(ErrorType.YUK_YERI_SINIR_HATASI);
            }
            if (liman.getYukler()[index]!=null){
                throw new LimanException(ErrorType.DOLU_YER_SECIMI);
            }
        return index;
    }

    public double agirlikBelirle(){
        double agirlik=Utility.doubleDegerAl("Yükün aðýrlýðýný giriniz.");
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

