package org.enes.lesson22.sehirApp;

public class Sehir {
    private String isim;
    private int plaka;
    private long nufus;
    private String bolge;

    public Sehir() {
    }

    public Sehir(String isim) {
        this.isim=isim;
    }

    public String getIsým() {
        return isim;
    }

    public void setIsým(String isim) {
        this.isim = isim;
    }

    public int getPlaka() {
        return plaka;
    }

    public void setPlaka(int plaka) {
        this.plaka = plaka;
    }

    public long getNufus() {
        return nufus;
    }

    public void setNufus(long nufus) {
        this.nufus = nufus;
    }

    public String getBolge() {
        return bolge;
    }

    public void setBolge(String bolge) {
        this.bolge = bolge;
    }

    @Override
    public String toString() {
        return "Sehir{" +
                "Ýsim='" + isim + '\'' +
                ", plaka=" + plaka +
                ", nufus=" + nufus +
                ", bolge='" + bolge + '\'' +
                '}';
    }
}
