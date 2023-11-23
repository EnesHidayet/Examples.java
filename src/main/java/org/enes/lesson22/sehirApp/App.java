package org.enes.lesson22.sehirApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    �ehirlerimizin isimleri plaka kodlar� n�fuslar� ve b�lgeleri olsun

    �ehir manager diye bir s�n�f�m�z olsun bu s�n�f bizim i�in �ehir s�n�f�n� y�neten bir s�n�f olucak
    burada �ehir s�n�f�n� y�neten metodlar yazaca��z.

    uygulama s�n�f�m�zda bir �ehirler listem olsun bu listeyide sehirmanager s�n�f�ndaki �ehirleri

    �ehileri olu�tur metodumuz olsun bu metod d��ar�dan bir array list als�n ve data baseden
    gelen String sehirler arrayindeki verilerle bu listeyi doldural�m.
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
