package org.enes.lesson21.utility;

import org.enes.lesson21.entity.Kullanici;

import java.util.List;

// kullan�c� i�in yapt���m�z bir interface
public interface ICrud {
    boolean kayitEt(Kullanici kullanici);
    List<Kullanici> kullanicilariGetir();
    //kullan�c� ad�, id uniqtir o y�zden silme i�lemi i�in genelde bunlar kullan�l�r.
    void sil(int id);
    void guncelle(int id);
}
