package org.enes.lesson14.kutuphaneApp;

/**
 * Bu sınıf Db sınıfını yöneten bir sınıf
 */
public class KutuphaneManager {



    public void kitapEkle(Kitap kitap){
        Kutuphane.arrayBoyutKontrol();
        Kutuphane.kitapS[Kutuphane.kitapIndex]=kitap;
        System.out.println(Kutuphane.kitapS[Kutuphane.kitapIndex].ad);
        Kutuphane.kitapIndex++;
        System.out.println("Kitaplar arrayinin boyutu==>"+Kutuphane.kitapS.length);

    }


    public static Kitap [] kitaplariGetir(){
        return Kutuphane.kitapS;
    }



    public Kitap kitapVarMi(String kitapAdi){

        for (int i=0;i<Kutuphane.kitapIndex;i++){

            if (Kutuphane.kitapS[i].ad.equals(kitapAdi)){
                return Kutuphane.kitapS[i];
            }

        }
        return null;

    }


    public int kitapVarMi2(String kitapAdi){

        for (int i=0;i<Kutuphane.kitapIndex;i++){

            if (Kutuphane.kitapS[i].ad.equals(kitapAdi)){
                return i;
            }

        }
        return -1;

    }

    public void kitapCikar(int index){

      for (int i=0;i<Kutuphane.kitapIndex;i++){
          if (index<i){
            Kutuphane.kitapS[i-1]=Kutuphane.kitapS[i];
          }
      }
      Kutuphane.kitapIndex--;
      Kutuphane.kitapS[Kutuphane.kitapIndex]=null;

    }


}
