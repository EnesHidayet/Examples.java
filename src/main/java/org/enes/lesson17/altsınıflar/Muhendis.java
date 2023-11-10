package org.enes.lesson17.altsýnýflar;

import org.enes.lesson17.Calisanlar;

public class Muhendis extends Calisanlar {

    public Muhendis(String isim, String soyisim) {
        super(isim, soyisim);
        this.unvan="Mühendis";
        this.maas=20000;
    }

    public Muhendis(String isim, String soyisim, double aylik) {
        super(isim, soyisim,aylik);

        if (aylik<20000){
            System.out.println("En düþük maaþ 20 bin TL dir. Mühendis maaþý 20 Bin TL olarak ayarlandý");
            this.maas=20000;
            this.unvan="Mühendis";
        } else if (aylik>=20000 && aylik<25000) {
            this.maas=aylik;
            this.unvan="Mühendis";
        }else if (aylik>=25000 && aylik<35000){
            this.maas=aylik;
            this.unvan="Kýdemli Mühendis";
        }else {
            this.maas=aylik;
            this.unvan="Yüksek mühendis";
        }


    }

    @Override
    public void zamYap(double oran) {
        super.zamYap(oran);
        this.maas+=250;
    }
}
