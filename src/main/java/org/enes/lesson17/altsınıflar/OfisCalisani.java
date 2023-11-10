package org.enes.lesson17.altsýnýflar;

import org.enes.lesson17.Calisanlar;

public class OfisCalisani extends Calisanlar {
    public OfisCalisani(String isim, String soyisim) {
        super(isim, soyisim);
        this.unvan="Ofis Çalýþaný";
        this.maas=18000;
    }

    public OfisCalisani(String isim, String soyisim,double aylik) {
        super(isim, soyisim, aylik);

        if (aylik<18000){
            System.out.println("En düþük maaþ 18 bin TL dir. Çalýþan maaþý 18 Bin TL olarak ayarlandý");
            this.maas=18000;
            this.unvan="Ofis Çalýþaný";
        } else if (aylik>=18000 && aylik<27000) {
            this.maas=aylik;
            this.unvan="Ofis Çalýþaný";
        } else {
            this.maas=aylik;
            this.unvan="Kýdemli Ofis Çalýþaný";
        }
    }
}
