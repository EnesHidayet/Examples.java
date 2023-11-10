package org.enes.lesson17.alts�n�flar;

import org.enes.lesson17.Calisanlar;

public class Muhendis extends Calisanlar {

    public Muhendis(String isim, String soyisim) {
        super(isim, soyisim);
        this.unvan="M�hendis";
        this.maas=20000;
    }

    public Muhendis(String isim, String soyisim, double aylik) {
        super(isim, soyisim,aylik);

        if (aylik<20000){
            System.out.println("En d���k maa� 20 bin TL dir. M�hendis maa�� 20 Bin TL olarak ayarland�");
            this.maas=20000;
            this.unvan="M�hendis";
        } else if (aylik>=20000 && aylik<25000) {
            this.maas=aylik;
            this.unvan="M�hendis";
        }else if (aylik>=25000 && aylik<35000){
            this.maas=aylik;
            this.unvan="K�demli M�hendis";
        }else {
            this.maas=aylik;
            this.unvan="Y�ksek m�hendis";
        }


    }

    @Override
    public void zamYap(double oran) {
        super.zamYap(oran);
        this.maas+=250;
    }
}
