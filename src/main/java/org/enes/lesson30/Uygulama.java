package org.enes.lesson30;

import java.sql.SQLSyntaxErrorException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Uygulama {
List<Film>  filmler;
Scanner scanner=new Scanner(System.in);

    public void baslangicVerisiOlustur() {
        Yonetmen yonetmen1 = new Yonetmen("Miyazaki", "Japonya");
        Film film1 = new Film("Ruhlarýn Kaçýþý", LocalDate.of(2001, 10, 10), 5000000, ETur.ANIME, yonetmen1, 9.5);
        Film film2 = new Film("Rüzgarlý Vadi", LocalDate.of(1984, 06, 8), 1000000, ETur.ANIME, yonetmen1, 9.1);
        Film film3 = new Film("Prenses Mononoke", LocalDate.of(1997, 10, 10), 30000000, ETur.ANIME, yonetmen1, 9.6);
        Film film4 = new Film("Yürüyen Þato", LocalDate.of(2004, 10, 10), 1000000, ETur.ANIME, yonetmen1, 8.7);

        Yonetmen yonetmen2 = new Yonetmen("Reha Erdem", "Türkiye");
        Film film5 = new Film("Kaç Para Kaç", LocalDate.of(1999, 10, 10), 100000, ETur.DRAMA, yonetmen2, 7.5);
        Film film6 = new Film("Korkuyorum Anne", LocalDate.of(2004, 06, 8), 300000, ETur.KARAMIZAH, yonetmen2, 8.1);
        Film film7 = new Film("Kosmos", LocalDate.of(2009, 12, 12), 500000, ETur.DRAMA, yonetmen2, 8.6);
        Film film8 = new Film("Seni Buldum Ya", LocalDate.of(2021, 12, 12), 400000, ETur.KARAMIZAH, yonetmen2, 7.2);

        Yonetmen yonetmen3 = new Yonetmen("David Fincher", "Amerika");
        Film film9 = new Film("Seven", LocalDate.of(1995, 10, 10), 2500000, ETur.DRAMA, yonetmen3, 8.8);
        Film film10 = new Film("Dövüþ Kulübü", LocalDate.of(1999, 06, 8), 2500000, ETur.AKSIYON, yonetmen3, 9.4);
        Film film11 = new Film("Zodiac", LocalDate.of(2007, 11, 20), 800000, ETur.GERILIM, yonetmen3, 7.8);
        Film film12 = new Film("Gone Girl", LocalDate.of(2014, 10, 10), 1500000, ETur.DRAMA, yonetmen3, 8.2);
        Film film13 = new Film("Mank", LocalDate.of(2020, 12, 12), 2000000, ETur.DRAMA, yonetmen3, 8.4);

        Yonetmen yonetmen4 = new Yonetmen("Cohens", "Amerika");
        Film film14 = new Film("Barton Fink", LocalDate.of(1991, 12, 12), 500000, ETur.GERILIM, yonetmen4, 8.5);
        Film film15 = new Film("Fargo", LocalDate.of(1996, 12, 12), 800000, ETur.GERILIM, yonetmen4, 8.1);
        Film film16 = new Film("Big Lebowski", LocalDate.of(1998, 12, 12), 1100000, ETur.KARAMIZAH, yonetmen4, 9.2);
        Film film17 = new Film("Nerdesin Be Birader", LocalDate.of(2000, 02, 2), 1500000, ETur.KARAMIZAH, yonetmen4, 7.8);
        Film film18 = new Film("Orada Olmayan Adam", LocalDate.of(2001, 7, 17), 500000, ETur.GERILIM, yonetmen4, 8.3);
        Film film19 = new Film("Ýhtiyarlara Yer Yok", LocalDate.of(2007, 7, 17), 1700000, ETur.DRAMA, yonetmen4, 9.3);
        Film film20 = new Film("Ciddi Bir Adam", LocalDate.of(2009, 7, 17), 500000, ETur.KARAMIZAH, yonetmen4, 8.0);

        Yonetmen yonetmen5 = new Yonetmen("Emin Alper", "Türkiye");
        Film film21 = new Film("Tepenin Ardý", LocalDate.of(2012, 7, 17), 50000, ETur.DRAMA, yonetmen5, 7.7);
        Film film22 = new Film("Kýz Kardeþler", LocalDate.of(2019, 7, 17), 400000, ETur.DRAMA, yonetmen5, 8.5);
        Film film23 = new Film("Kurak Günler", LocalDate.of(2022, 7, 17), 600000, ETur.DRAMA, yonetmen5, 8.4);

        Yonetmen yonetmen6 = new Yonetmen("Wes Anderson", "Amerika");
        Film film24 = new Film("Yaman Tilki", LocalDate.of(2009, 7, 17), 900000, ETur.ANIMASYON, yonetmen6, 7.8);
        Film film25 = new Film("Moonrise Kingdom", LocalDate.of(2012, 7, 17), 8500000, ETur.FANTASTIK, yonetmen6, 8.6);
        Film film26 = new Film("Büyük Budapeþte Oteli", LocalDate.of(2014, 7, 17), 1200000, ETur.FANTASTIK, yonetmen6, 9.0);
        Film film27 = new Film("Köpek Adasý", LocalDate.of(2018, 7, 17), 1500000, ETur.ANIMASYON, yonetmen6, 9.2);

        filmler = new ArrayList<>(List.of(
                film1, film2, film3, film4, film5, film6, film7, film8, film9, film10,
                film11, film12, film13, film14, film15, film16, film17, film18, film19, film20,
                film21, film22, film23, film24, film25, film26, film27
        ));
    }

    /*
        puanlarý 8 den büyük olan filmleri bir sette toplayalým ve puaný 8 den büyük olanlarýn yönetmenlerini bir sette toplayalým.
     */

    public void yuksekPuanlilar(){
        Set<Film>filmlerSet=filmler.stream().filter(x->x.getPuan()>8).collect(Collectors.toSet());
        filmlerSet.forEach(System.out::println);
        System.out.println("*****************************************************************");
        Set<String> yuksekPuanliYonetmenler=filmler.stream().filter(f->f.getPuan()>8).map(f->f.getYonetmen().getIsim()).collect(Collectors.toSet());
        yuksekPuanliYonetmenler.forEach(System.out::println);
    }

    /*
        Dýþarýdan bir ülke ismi alalým bir metod yazalým ve metot o ülkeli olan yönetmenleri bir listede toplayalým.
     */

    public void ulkeyeGoreYonetmenler(){
        System.out.println("Ülke ismi giriniz...:");
        String ulke=scanner.nextLine();
        List<String>yonetmenler=filmler.stream().filter(f->f.getYonetmen().getUlke().equalsIgnoreCase(ulke)).map(f->f.getYonetmen().getIsim()).distinct().collect(Collectors.toList());
        yonetmenler.forEach(System.out::println);

    }

    /*
        hasýlatý en yüksek filmi bulalým.
     */

    public void hasilatiEnYuksekFilm(){
        Optional<Film> film = filmler.stream().max(Comparator.comparingLong(f -> f.getHasilat()));
        System.out.println("En yüksek hasýlata sahip film...:"+film);
    }

    /*
        Film türlerine göre filmleri tutalým.
     */

    public void turuneGoreFilmler(){
        Map<ETur,List<Film>>tureGoreFilm=filmler.stream().collect(Collectors.groupingBy(x->x.getTur()));
        tureGoreFilm.entrySet().forEach(System.out::println);
    }

    /*
        Her türkdeki en yüksek hasýlatlý filmi eþleþtirelim.
     */

    public void turuneGoreHasilatiEnYuksekFilm(){
        Map<ETur, Optional<Film>> tureGoreFilm=filmler.stream().collect(Collectors.
                groupingBy(x->x.getTur(),Collectors.maxBy(Comparator.comparingLong(Film::getHasilat))));
        System.out.println("Türüne göre en yüksek hasýlatlý film...:");
        tureGoreFilm.entrySet().forEach(System.out::println);
    }

    public void puanaGoreSirala(){
        filmler.stream().sorted(Comparator.comparing(f->f.getPuan())).skip(5).forEach(System.out::println);
    }

    public void turuneGoreOrtPuan(ETur tur){
        Double collect = filmler.stream().filter(f -> f.getTur().equals(tur)).collect(Collectors.averagingDouble(f->f.getPuan()));
        System.out.println(collect);

    }
    public void filmleriBelirliAraliktakiHasilataGore(long baslangic,long bitis){
        filmler.stream().filter(f->(f.getHasilat()<bitis &&f.getHasilat()>baslangic)).forEach(System.out::println);
    }

    public void animelerinToplamHasilati(){
        double x = filmler.stream().filter(f -> f.getTur().equals(ETur.ANIME)).mapToDouble(f -> f.getHasilat()).sum();
        System.out.println(x);
    }

    public int yonetmeninFilmSayisi(String yonetmen){
        int x= (int) filmler.stream().filter(f->f.getYonetmen().getIsim().equals(yonetmen)).distinct().count();
        return x;
    }



    public static void main(String[] args) {
        Uygulama uygulama=new Uygulama();
        uygulama.baslangicVerisiOlustur();
//        uygulama.yuksekPuanlilar();
//        uygulama.ulkeyeGoreYonetmenler();
//        uygulama.hasilatiEnYuksekFilm();
//        uygulama.turuneGoreFilmler();
//        uygulama.turuneGoreHasilatiEnYuksekFilm();
//        uygulama.puanaGoreSirala();
//        uygulama.turuneGoreOrtPuan(ETur.ANIME);
//        uygulama.filmleriBelirliAraliktakiHasilataGore(500000,999999);
//        uygulama.animelerinToplamHasilati();
//        System.out.println(uygulama.yonetmeninFilmSayisi("Miyazaki"));

        /**
         * Son 3 tanesini yapamadým.
         */

    }
}
