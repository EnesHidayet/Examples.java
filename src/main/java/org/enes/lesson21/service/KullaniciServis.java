package org.enes.lesson21.service;

import org.enes.lesson21.entity.Kullanici;
import org.enes.lesson21.repository.KullaniciRepository;
import org.enes.lesson21.utility.DataBase;
import org.enes.lesson21.utility.ICrud;

import java.util.List;

public class KullaniciServis implements ICrud {

    private KullaniciRepository kullaniciRepository;

    public KullaniciServis(){
        this.kullaniciRepository=new KullaniciRepository();
    }


    @Override
    public boolean kayitEt(Kullanici kullanici) {
        boolean kontrol=kullaniciRepository.kayitEt(kullanici);
        if (kontrol){
            System.out.println("Kullanýcý baþarý ile kayýt edilidi.");
        }else System.out.println("Kayýt sýrasýnda hata meydana geldi.");

        return kontrol;
    }

    @Override
    public List<Kullanici> kullanicilariGetir() {
        List<Kullanici> kullanicilar=kullaniciRepository.kullanicilariGetir();
        if (kullanicilar.size()==0){
            System.out.println("Herhangi bir kullanýcý bulunamadý.");
        }
        return kullanicilar;
    }

    @Override
    public void sil(int id) {

    }

    @Override
    public void guncelle(int id) {

    }

    public Kullanici kullaniciAdiveSifreIleKullaniciGetir(String kullaniciAdi, String sifre) {
        Kullanici kullanici=kullaniciRepository.kullaniciAdiveSifreIleKullaniciGetir(kullaniciAdi,sifre);
        if (kullanici==null){
            System.out.println("Kullanýcý adý veya þifre hatalý.");
        }else System.out.println("Giriþ baþarýlý hoþgeldiniz. ->"+kullanici.getUsername());

        return kullanici;
    }

    public Kullanici kullaniciAdiIleKullaniciGetir(String kullaniciAdi){
        Kullanici kullanici=kullaniciRepository.kullaniciAdiIleKullaniciGetir(kullaniciAdi);
        if (kullanici!=null){
            System.out.println("Kullanýcý ismi kullanýlýyor baþka bir isim seçiniz..");
        }
        return kullanici;
    }

    public void defaultKullanici(){
        kullaniciRepository.defaultKullanici();
    }
}
