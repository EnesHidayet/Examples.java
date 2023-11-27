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

    1- b�lgelerimiz 1. b�lge 2. b�lge 3. b�lge 4. b�lge olsun
    //5 milyondan fazla n�fuslu �ehirleri ayr� listeye ekleyin
    bu listede {Ankara,Bolu,Amasya} illeri var m� yok mu geri d�nen bir metot yazal�m.


 */
public class App {

    List<Sehir> sehirList;

    List<Sehir> buyukSehirler;

    SehirManager sehirManager;



    public App(){
        sehirList=new ArrayList<>();
        sehirManager=new SehirManager();
    }


    public void sehirleriOlustur(){

        for (int i=0;i<Database.iller.length;i++){
            Sehir sehir=new Sehir(Database.iller[i]);
            sehirManager.plakaKoduAta(sehir,i+1);
            sehirManager.birSehreNufusAta(sehir);
            sehirManager.birSehreBolgeAta(sehir);
            sehirList.add(sehir);
        }

    }

    public void nufus5MilyondanFazla(){
            buyukSehirler=new ArrayList<>();
        for (int i=0;i<sehirList.size();i++){
            if (sehirList.get(i).getNufus()>5_000_000){
                buyukSehirler.add(sehirList.get(i));
            }
        }
        System.out.println(buyukSehirler);

    }

    public boolean illerVarMi(){
        ArrayList<Sehir> list=new ArrayList<>(List.of(sehirList.get(4),sehirList.get(5),sehirList.get(13)));

        if (buyukSehirler.containsAll(list)){
            return true;
        }

        return false;
    }






    public static void main(String[] args) {
        App app=new App();

        app.sehirleriOlustur();

        app.sehirList.get(5).setNufus(6_000_000);
        app.sehirList.get(4).setNufus(6_000_000);
        app.sehirList.get(13).setNufus(6_000_000);

        app.sehirList.forEach(s-> System.out.println(s));

        app.nufus5MilyondanFazla();

        System.out.println("Arad���m�z �ehirlerin 5 milyondan fazla n�fusu olup olmad���n�n cevab�...:"+app.illerVarMi());


    }







}
