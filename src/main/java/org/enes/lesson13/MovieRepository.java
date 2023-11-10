package org.enes.lesson13;

import java.util.Arrays;

public class MovieRepository {

    public int filmSayisi=0;

    public void save(String ad,int cikisYili,double ortPuan,String yonetmen,String dil, String cekilenYer,String sure,String [] etiket,String [] oyuncu){
        Movie film=new Movie();
        film.adi=ad;
        film.cikisYili=cikisYili;
        film.ortalamaPuani=ortPuan;
        film.yonetmen=yonetmen;
        film.dili=dil;
        film.cekimYeri=cekilenYer;
        film.suresi=sure;
        film.etiketler=etiket;
        film.oyuncular=oyuncu;

        MovieVeriTabani.filmler[filmSayisi++] = film;
    }

    public void filmListele(){
        for (int i=0;i<filmSayisi;i++) {
            Movie film = MovieVeriTabani.filmler[i];
            System.out.println("Filmin adý "+film.adi+" - Çýkýþ Yýlý "+film.cikisYili+" - Ortalama puaný "+film.ortalamaPuani+" - Yönetmeni "+film.yonetmen+
                    " - Dili "+film.dili+" - Çekim yeri "+film.cekimYeri+" - Filmin süresi "+film.suresi+" - Etiketleri "+ Arrays.toString(film.etiketler)+
                    " - Oyuncularý "+Arrays.toString(film.oyuncular));
        }

    }


}
