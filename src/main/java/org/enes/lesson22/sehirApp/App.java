package org.enes.lesson22.sehirApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Þehirlerimizin isimleri plaka kodlarý nüfuslarý ve bölgeleri olsun

    Þehir manager diye bir sýnýfýmýz olsun bu sýnýf bizim için þehir sýnýfýný yöneten bir sýnýf olucak
    burada þehir sýnýfýný yöneten metodlar yazacaðýz.

    uygulama sýnýfýmýzda bir þehirler listem olsun bu listeyide sehirmanager sýnýfýndaki þehirleri

    þehileri oluþtur metodumuz olsun bu metod dýþarýdan bir array list alsýn ve data baseden
    gelen String sehirler arrayindeki verilerle bu listeyi dolduralým.
    plka kodu uret metodumuz olsun ==>

 */
public class App {

    List<Sehir> sehirList=new ArrayList<>();


    public void sehirleriOlustur(String[] sehirler){

        for (int i=0;i<sehirler.length;i++){
            Sehir sehir=new Sehir(Database.iller[i]);
            sehirList.add(sehir);
        }

    }


    public static void main(String[] args) {
        App app=new App();

        app.sehirleriOlustur(Database.iller);

        app.sehirList.forEach(s-> System.out.println(s));
    }







}
