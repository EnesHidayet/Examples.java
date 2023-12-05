package org.enes.lesson25.set;

import java.util.Objects;

public class Kullanici {
    private String uuid;
    static int kullaniciSayisi;
    private String kullaniciAdi;
    private String sifre;
    private String email;
    private int yas;

    public Kullanici(String kullaniciAdi, String sifre, String email, int yas) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.email = email;
        this.yas = yas;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kullanici{" +
                "kullaniciAdi='" + kullaniciAdi + '\'' +
                ", sifre='" + sifre + '\'' +
                ", email='" + email + '\'' +
                ", yas=" + yas +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Kullanici kullanici = (Kullanici) object;
        return yas == kullanici.yas && Objects.equals(uuid, kullanici.uuid) && Objects.equals(kullaniciAdi, kullanici.kullaniciAdi) && Objects.equals(sifre, kullanici.sifre) && Objects.equals(email, kullanici.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, kullaniciAdi, sifre, email, yas);
    }
}
