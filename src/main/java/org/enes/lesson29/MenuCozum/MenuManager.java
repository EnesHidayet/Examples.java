package org.enes.lesson29.MenuCozum;

import org.enes.Odev.Manager;

import java.util.*;
import java.util.stream.Collectors;

public class MenuManager {
    Random random=new Random();
    List<EIcecek> icecekler=new ArrayList<>(Arrays.asList(EIcecek.values()));
    List<Menu> menuler=new ArrayList<>();

    public ECorba randomCorbaAta(){
        int index=random.nextInt(ECorba.values().length);

        return ECorba.values()[index];
    }

    public EIcecek randomIcecekAta(){
        int index=random.nextInt(EIcecek.values().length);

        return EIcecek.values()[index];
    }

    public ETatli randomTatliAta(){
        int index=random.nextInt(ETatli.values().length);

        return ETatli.values()[index];
    }

    public Menu gunlukMenuOlustur(){
        ECorba corba=ECorba.values()[random.nextInt(ECorba.values().length)];
        EYemek yemek=EYemek.values()[random.nextInt(EYemek.values().length)];
        ETatli tatli=ETatli.values()[random.nextInt(ETatli.values().length)];
        EIcecek icecek=EIcecek.values()[random.nextInt(EIcecek.values().length)];
        return new Menu(yemek,corba,icecek,tatli);
    }

    public Enum menuBelirle(Enum[] dizi){
        int index=random.nextInt(dizi.length);
        return dizi[index];
    }

    public Menu gunlukMenuOlustur2(){
        ECorba corba= (ECorba) menuBelirle(ECorba.values());
        EYemek yemek= (EYemek) menuBelirle(EYemek.values());
        ETatli tatli= (ETatli) menuBelirle(ETatli.values());
        EIcecek icecek= icecekAta2();
        return new Menu(yemek,corba,icecek,tatli);
    }

    public void haftalikMenuOlustur(){
        for (int i=0;i<EGunler.values().length;i++){
            Menu menu=gunlukMenuOlustur2();
            menu.setGun(EGunler.values()[i]);
            System.out.println(menu.getGun()+"====>"+menu);
            menuler.add(menu);
        }
    }

    public EIcecek icecekAta(EIcecek[] dizi){
        int index=random.nextInt(dizi.length);
        while (dizi[index].atandiMi){
            index=random.nextInt(dizi.length);
        }
        dizi[index].atandiMi=true;
        return dizi[index];
    }

    public EIcecek icecekAta2(){
        if (icecekler.isEmpty()){
            System.out.println("Liste Tekrar Dolduruldu.");
            icecekler=new ArrayList<>(Arrays.asList(EIcecek.values()));
        }
        int index=random.nextInt(icecekler.size());
        EIcecek icecek=icecekler.get(index);
        icecekler.remove(icecek);
        System.out.println("Liste boyutu--->"+icecekler.size());
        return icecek;
    }



    public static void main(String[] args) {
        MenuManager menuManager=new MenuManager();
        menuManager.haftalikMenuOlustur();
        /**
         * oluþturduðumuz menüleri listeye atalým
         * 1- gun isimlerine göre menüleri bir mape aktaralým.(Stream yapýsý ile)
         */

        Map<EGunler,Menu> mapMenu=menuManager.menuler.stream().collect(Collectors.toMap(m->m.getGun(),v->v));
        System.out.println(mapMenu.get(EGunler.CUMA));



    }


}
