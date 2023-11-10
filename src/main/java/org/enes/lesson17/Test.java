package org.enes.lesson17;

import org.enes.lesson17.alts�n�flar.Muhendis;
import org.enes.lesson17.alts�n�flar.OfisCalisani;

public class Test {
    /**
     * �al��anlar�m�z�n isim soyisim i� unvan� gibi de�erleri olsun
     * iki tane ayr� constructor yap�lacak birisi (isim,soyisim), di�eri (isim soyisim maa�)
     *
     * i� unvanlar� ==> Muhendis ve ofis �al��an�
     * Buradan bir kal�t�m i�eren yap� ��karman�z� bekliyorum
     * daha sonra kal�t�m ile beraber
     * m�hendis i�in e�er maa� girilmez ise default de�er =20.000 olsun
     * e�er maa� 20.000 ile 25.000 aras�nda ise M�hendis
     * 25 ile 35.000 aras�nda ise k�demli m�hendis
     * 35.000 �st�nde ise y�ksek m�hendis olsun
     * e�er 20.000 alt�nda bir maa� verilmi� ise en d���k maa� 20.000 dir personel maa�� olarak ayarland�.
     *
     * ofis �al��an� i�in
     * e�er maa� girilmez ise default de�er =18.000 olsun
     * e�er maa� 18.000 ile 27.000 aras�nda ise �al��an
     * 27.000 �st�nde ise k�demli �al��an olsun
     * e�er 18.000 alt�nda bir maa� verilmi� ise en d���k maa� 18.000 dir personel maa�� olarak ayarland�.
     *
     *
     * �dev==> maa� zamm� metodu istiyorum. d��ar�dan bir oran al�p o oranda art�� yaps�n
     * buna ek olarak m�hendislere +250 tl de bonus ekleyelim.
     *
     * �dev==> Bir bilgisayar s�n�f� soyutlayaca��z.
     * bu bilgisayar s�n�f�n� kal�t�m uygulayarak alt s�n�flar�n� olu�tural�m en az 2 kal�t�m ve bilgisayarlar�m�z�n �zellikleri i�inde s�n�flar yaratal�m.
     * anakart - ram - klavye - mouse gibi 5-6 tane �zellik yaz�p bu �zeller i�in s�n�f olu�tural�m
     * test s�n�f�nda denemelerle nesnelerimizi olu�tural�m.
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
