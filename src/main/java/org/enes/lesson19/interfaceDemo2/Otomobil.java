package org.enes.lesson19.interfaceDemo2;

public class Otomobil extends Arac implements IKaraAraci,IOtomobil{
    private String marka;

    public Otomobil(int hiz, String marka) {
        super(hiz);
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Otomobil{" +
                "marka='" + marka + '\'' +
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
    public void drifYap() {
        System.out.println(getClass().getSimpleName()+" drift yap�yor.");
    }
}
