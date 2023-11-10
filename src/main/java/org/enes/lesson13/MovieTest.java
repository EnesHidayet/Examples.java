package org.enes.lesson13;

import java.util.Arrays;

public class MovieTest {
    public static void main(String[] args) {

//        Movie film1=new Movie();
//        film1.adi="Mr. Nobody";
//        film1.ortalamaPuani=8.5;
       String [] etiketlerDizisi={"Düþündürücü", "Bilim Kurgu", "Fantastik"};
        String [] oyuncular={"Jared Leto", "Sarah Polley", "Diane Kruger", "Linh Dan Pham", "Rhys Ifans"};
//        film1.dili="ingilizce";
//        film1.suresi="141 dakika";
//        film1.cekimYeri="Belçika";
//        film1.yonetmen="Jaco Van Dormael";
//        film1.puanEkle(7,0);
//        film1.puanEkle(10,1);
//        film1.etiketler=etiketlerDizisi;
//        System.out.println(Arrays.toString(etiketlerDizisi));
//        film1.oyuncular=oyuncular;
//        System.out.println(Arrays.toString(oyuncular));
//
//
//        Movie film2=new Movie();
//        film2.adi="The Big Lebowski";
//        film2.ortalamaPuani=7.9;
       String [] etiketlerDizisi2={"Kült", "Komik", "Aksiyon"};
        String [] oyuncular2={"Jeff Bridges", "John Goodman", "Julianne Moore", "Steve Buscemi", "David Huddleston"};
//        film2.dili="ingilizce";
//        film2.cekimYeri="ABD";
//        film2.suresi="117 dakika";
//        film2.yonetmen="Joel Coen";
//        film2.puanEkle(7,0);
//        film2.puanEkle(9,1);
//        film2.etiketler=etiketlerDizisi;
//        System.out.println(Arrays.toString(etiketlerDizisi));
//        film2.oyuncular=oyuncular;
//        System.out.println(Arrays.toString(oyuncular));
//
//
//        MovieRepository film=new MovieRepository();
//        film.filmListele();



        MovieRepository film=new MovieRepository();
        film.save("Mr Nobody",2009,8.5,"Jaco Van Dormael","Ýngilizce","Belçika","141 dakika",etiketlerDizisi,oyuncular);
        film.save("The Big Lebowski",1998,7.9,"Joel Coen","Ýngilizce","ABD","117 dakika",etiketlerDizisi2,oyuncular2);

        film.filmListele();



    }
}
