package org.enes.Odev;

public class Menu {
    EGunler gun;
    ECorbalar corba;
    EYemekler yemek;
    ETatlilar tatli;
    EIcecekler icecek;

    public Menu(EGunler gun, ECorbalar corba, EYemekler yemek, ETatlilar tatli, EIcecekler icecek) {
        this.gun = gun;
        this.corba = corba;
        this.yemek = yemek;
        this.tatli = tatli;
        this.icecek = icecek;
    }

    public EGunler getGun() {
        return gun;
    }

    public void setGun(EGunler gun) {
        this.gun = gun;
    }

    public ECorbalar getCorba() {
        return corba;
    }

    public void setCorba(ECorbalar corba) {
        this.corba = corba;
    }

    public EYemekler getYemek() {
        return yemek;
    }

    public void setYemek(EYemekler yemek) {
        this.yemek = yemek;
    }

    public ETatlilar getTatli() {
        return tatli;
    }

    public void setTatli(ETatlilar tatli) {
        this.tatli = tatli;
    }

    public EIcecekler getIcecek() {
        return icecek;
    }

    public void setIcecek(EIcecekler icecek) {
        this.icecek = icecek;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "gun=" + gun +
                ", corba=" + corba +
                ", yemek=" + yemek +
                ", tatli=" + tatli +
                ", icecek=" + icecek +
                '}';
    }
}
