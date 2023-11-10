package org.enes.lesson17.alts�n�flar;

import org.enes.lesson17.Calisanlar;

public class OfisCalisani extends Calisanlar {
    public OfisCalisani(String isim, String soyisim) {
        super(isim, soyisim);
        this.unvan="Ofis �al��an�";
        this.maas=18000;
    }

    public OfisCalisani(String isim, String soyisim,double aylik) {
        super(isim, soyisim, aylik);

        if (aylik<18000){
            System.out.println("En d���k maa� 18 bin TL dir. �al��an maa�� 18 Bin TL olarak ayarland�");
            this.maas=18000;
            this.unvan="Ofis �al��an�";
        } else if (aylik>=18000 && aylik<27000) {
            this.maas=aylik;
            this.unvan="Ofis �al��an�";
        } else {
            this.maas=aylik;
            this.unvan="K�demli Ofis �al��an�";
        }
    }
}
