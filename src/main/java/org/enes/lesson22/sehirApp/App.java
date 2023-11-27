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

    1- bölgelerimiz 1. bölge 2. bölge 3. bölge 4. bölge olsun
    //5 milyondan fazla nüfuslu þehirleri ayrý listeye ekleyin
    bu listede {Ankara,Bolu,Amasya} illeri var mý yok mu geri dönen bir metot yazalým.


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

        System.out.println("Aradýðýmýz þehirlerin 5 milyondan fazla nüfusu olup olmadýðýnýn cevabý...:"+app.illerVarMi());


    }







}
