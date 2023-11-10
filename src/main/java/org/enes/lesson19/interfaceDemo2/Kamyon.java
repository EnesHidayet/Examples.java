package org.enes.lesson19.interfaceDemo2;

public class Kamyon extends Arac implements IKaraAraci,IYukAlanlar,IKamyon{
    private int tekerSayisi;

    public Kamyon(int hiz, int tekerSayisi) {
        super(hiz);
        this.tekerSayisi = tekerSayisi;
    }

    public int getTekerSayisi() {
        return tekerSayisi;
    }

    public void setTekerSayisi(int tekerSayisi) {
        this.tekerSayisi = tekerSayisi;
    }

    @Override
    public String toString() {
        return "Kamyon{" +
                "tekerSayisi=" + tekerSayisi +
                '}';
    }

    @Override
    public void sur() {
        System.out.println(getClass().getSimpleName()+" s�r�l�yor.");
    }

    @Override
    public void frenYap() {
        System.out.println(getClass().getSimpleName()+" frenleme yap�yor.");
    }

    @Override
    public void yukAl() {
        System.out.println(getClass().getSimpleName()+" y�k al�yor.");
    }

    @Override
    public void yukBosalt() {
        System.out.println(getClass().getSimpleName()+" y�k bo�alt�yor.");
    }

    @Override
    public void dingilAyari() {
        System.out.println(getClass().getSimpleName()+"un dingilleri ayarlan�yor.");
    }
}
