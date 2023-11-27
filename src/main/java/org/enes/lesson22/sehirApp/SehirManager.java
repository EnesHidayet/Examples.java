package org.enes.lesson22.sehirApp;

import java.util.List;
import java.util.Random;

/*
      Bir þehre random nüfus atama olsun.(500 bin ile 10 milyon arasý)
 */
public class SehirManager implements ISehir{

    public void birSehreNufusAta(Sehir sehir){
        Random random=new Random();

        sehir.setNufus(random.nextLong(500000,10000000));

//        System.out.println(sehir.getNufus());
    }

    @Override
    public void plakaKoduAta(Sehir sehir,int i) {

                if (i<10){
                    sehir.setPlaka(("0"+(i)));
                }else sehir.setPlaka((i)+"");


    }

    public void birSehreBolgeAta(Sehir sehir){

            EBolge bolge = EBolge.values()[new Random().nextInt(EBolge.values().length)];
            sehir.setBolge(bolge);


    }

//    public static void main(String[] args) {
//        SehirManager sehirManager=new SehirManager();
//        Sehir sehir=new Sehir("Ankara");
//        sehirManager.birSehreNufusAta(sehir);
//    }

}
