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
            System.out.println("Kullan�c� ba�ar� ile kay�t edilidi.");
        }else System.out.println("Kay�t s�ras�nda hata meydana geldi.");

        return kontrol;
    }

    @Override
    public List<Kullanici> kullanicilariGetir() {
        List<Kullanici> kullanicilar=kullaniciRepository.kullanicilariGetir();
        if (kullanicilar.size()==0){
            System.out.println("Herhangi bir kullan�c� bulunamad�.");
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
            System.out.println("Kullan�c� ad� veya �ifre hatal�.");
        }else System.out.println("Giri� ba�ar�l� ho�geldiniz. ->"+kullanici.getUsername());

        return kullanici;
    }

    public Kullanici kullaniciAdiIleKullaniciGetir(String kullaniciAdi){
        Kullanici kullanici=kullaniciRepository.kullaniciAdiIleKullaniciGetir(kullaniciAdi);
        if (kullanici!=null){
            System.out.println("Kullan�c� ismi kullan�l�yor ba�ka bir isim se�iniz..");
        }
        return kullanici;
    }

    public void defaultKullanici(){
        kullaniciRepository.defaultKullanici();
    }
}
