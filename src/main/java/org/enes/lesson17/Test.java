package org.enes.lesson17;

import org.enes.lesson17.altsýnýflar.Muhendis;
import org.enes.lesson17.altsýnýflar.OfisCalisani;

public class Test {
    /**
     * Çalýþanlarýmýzýn isim soyisim iþ unvaný gibi deðerleri olsun
     * iki tane ayrý constructor yapýlacak birisi (isim,soyisim), diðeri (isim soyisim maaþ)
     *
     * iþ unvanlarý ==> Muhendis ve ofis çalýþaný
     * Buradan bir kalýtým içeren yapý çýkarmanýzý bekliyorum
     * daha sonra kalýtým ile beraber
     * mühendis için eðer maaþ girilmez ise default deðer =20.000 olsun
     * eðer maaþ 20.000 ile 25.000 arasýnda ise Mühendis
     * 25 ile 35.000 arasýnda ise kýdemli mühendis
     * 35.000 üstünde ise yüksek mühendis olsun
     * eðer 20.000 altýnda bir maaþ verilmiþ ise en düþük maaþ 20.000 dir personel maaþý olarak ayarlandý.
     *
     * ofis çalýþaný için
     * eðer maaþ girilmez ise default deðer =18.000 olsun
     * eðer maaþ 18.000 ile 27.000 arasýnda ise Çalýþan
     * 27.000 üstünde ise kýdemli çalýþan olsun
     * eðer 18.000 altýnda bir maaþ verilmiþ ise en düþük maaþ 18.000 dir personel maaþý olarak ayarlandý.
     *
     *
     * ödev==> maaþ zammý metodu istiyorum. dýþarýdan bir oran alýp o oranda artýþ yapsýn
     * buna ek olarak mühendislere +250 tl de bonus ekleyelim.
     *
     * ödev==> Bir bilgisayar sýnýfý soyutlayacaðýz.
     * bu bilgisayar sýnýfýný kalýtým uygulayarak alt sýnýflarýný oluþturalým en az 2 kalýtým ve bilgisayarlarýmýzýn özellikleri içinde sýnýflar yaratalým.
     * anakart - ram - klavye - mouse gibi 5-6 tane özellik yazýp bu özeller için sýnýf oluþturalým
     * test sýnýfýnda denemelerle nesnelerimizi oluþturalým.
     */

    public static void main(String[] args) {


        Muhendis muhendis=new Muhendis("Hidayet","Aslan",35000);
        muhendis.bilgileriGoster();

        Muhendis muhendis1=new Muhendis("Hidayet","Aslan",27999);
        muhendis1.zamYap(0.2);
        muhendis1.bilgileriGoster();


        OfisCalisani ofisCalisani=new OfisCalisani("Enes","Aslan",27999);
        ofisCalisani.zamYap(0.2);
        ofisCalisani.bilgileriGoster();









    }


}
