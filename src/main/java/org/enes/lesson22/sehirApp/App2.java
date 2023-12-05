package org.enes.lesson22.sehirApp;

import java.text.Collator;
import java.util.*;

/*
            COMPARATOR KULLANIMI ÝLE ÝLGÝLÝ ÖRNEKLER
 */
public class App2 {

    List<Sehir> sehirList;
    SehirManager sehirManager;



    public App2(){
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

    public void sehirleriNufusaGoreSirala(ArrayList<Sehir> sehirler){
        Comparator<Sehir> kucuktenBuyugeNufus= new Comparator<Sehir>() {
            @Override
            public int compare(Sehir o1, Sehir o2) {
               return (int) (o1.getNufus()-o2.getNufus());
            }
        };

        Collections.sort(sehirler,kucuktenBuyugeNufus);
    }

    public void sehirleriIsmeGoreSirala(ArrayList<Sehir> sehirler){
//        Collator collator=Collator.getInstance();
        Comparator<Sehir> aDanZYe= new Comparator<Sehir>() {
            @Override
            public int compare(Sehir o1, Sehir o2) {
                return (o1.getIsim().compareTo(o2.getIsim()));
            }
        };

        Collections.sort(sehirler,aDanZYe);
    }

    public ArrayList<Sehir> sehirleriIsmeGoreSirala2(ArrayList<Sehir> sehirler){
//        Comparator<Sehir> zDenAYa= new Comparator<Sehir>() {
//            @Override
//            public int compare(Sehir o1, Sehir o2) {
//                return (o2.getIsim().compareTo(o1.getIsim()));
//            }
//        };
//        Collator collator=Collator.getInstance(new Locale("tr","TR"));

        Collections.sort(sehirler,(sehir1,sehir2) -> sehir2.getIsim().compareTo(sehir1.getIsim()));
        return sehirler;
    }

    public ArrayList<Sehir> bolgeyeGoreSirala(ArrayList<Sehir> sehirler){
        Comparator<Sehir> comparator= new Comparator<Sehir>() {
            @Override
            public int compare(Sehir o1, Sehir o2) {
                return (o1.getBolge().ordinal()-o2.getBolge().ordinal());
            }
        };

        Collections.sort(sehirler,comparator);

        return sehirler;
    }

    public ArrayList<Sehir> plakayaGoreSirala(ArrayList<Sehir> sehirler){
        Comparator<Sehir> comparator= new Comparator<Sehir>() {
            @Override
            public int compare(Sehir o1, Sehir o2) {
                return (o1.getPlaka().compareTo(o2.getPlaka()));
            }
        };

        Collections.sort(sehirler,comparator);
        return sehirler;
    }

    public static void main(String[] args) {
        App2 app=new App2();
        app.sehirleriOlustur();

//        app.sehirList.forEach(System.out::println);
        // veya aþaðýdaki lambda fonksiyonu ile yazdýrýlabilir.

//        Collections.shuffle(app.sehirList);
        // nüfusa göre sýrlama yapacaðýz.
        app.sehirleriNufusaGoreSirala((ArrayList<Sehir>) app.sehirList);
        app.sehirList.forEach(sehir -> System.out.println(sehir));
        System.out.println("****************************************************************");
        System.out.println("****************************************************************");
        System.out.println("****************************************************************");
        System.out.println("****************************************************************");
        //isme göre sýralama yapalým.
        app.sehirleriIsmeGoreSirala((ArrayList<Sehir>) app.sehirList);
        app.sehirList.forEach(sehir -> System.out.println(sehir));
        //isme göre z den a ya doðru yazdýrma
        System.out.println("****************************************************************");
        System.out.println("****************************************************************");
        System.out.println("****************************************************************");
        System.out.println("****************************************************************");
        ArrayList<Sehir> zDenAYa=app.sehirleriIsmeGoreSirala2((ArrayList<Sehir>) app.sehirList);
        zDenAYa.forEach(sehir-> System.out.println(sehir));
        System.out.println("****************************************************************");
        System.out.println("****************************************************************");
        System.out.println("****************************************************************");
        System.out.println("****************************************************************");
        ArrayList<Sehir> bolgelereGore=app.bolgeyeGoreSirala((ArrayList<Sehir>) app.sehirList);
        bolgelereGore.forEach(sehir-> System.out.println(sehir));
        System.out.println("****************************************************************");
        System.out.println("****************************************************************");
        System.out.println("****************************************************************");
        System.out.println("****************************************************************");
        ArrayList<Sehir> plakayaGore=app.plakayaGoreSirala((ArrayList<Sehir>) app.sehirList);
        plakayaGore.forEach(sehir-> System.out.println(sehir));



    }







}
