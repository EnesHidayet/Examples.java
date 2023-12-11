package org.enes.lesson34.odevOgrenciList;

import org.enes.lesson34.FileSabitler;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
isimlistesi.txt dosyam�z olacak
bu dosyay� okuyp baska bir dosyaya yazacag�z secilecekler.txt dosyas�na
daha sonra islemler yap�p birtane veri secip bu veri secilmisler.txt dosyas�na ekleyece�iz
bu 3 dosya is�in bir sabitler s�n�f� olustural�m
OgrenciFileISlemler s�nf�m�z olsun bu s�n�fda bir ogrenci listesi tutal�m
1- dosyadan veri okuma ==> dosyadan okudugumuz(isimlistesi.txt) veriyi listeye ekleyece�iz
2-ogrenci listemizdeki verileri secilecekler.txt dosyas�na yazd�racag�z;
3-ogrenci sec metodu yazal�m==> buda listemizden rastgele ogrenci secmek i�in bir index degeri donsun
4-secilen ogrenciyi secilmisler.txt dosyas�na yazd�ral�m ve ayn� zmanda secilecler.txt de dosyas�ndan c�kartal�m
rastgele ogrenci secilecek rastgele ogrenci sec metodu ile beraber gelen indexden daha sonra bu veri secilmisler.txt aktar�lacak
secilecekler.txt guncellenecek
*/
public class OgrenciFileIslemler {

    public static List<String> ogrenciList;

    public OgrenciFileIslemler() {
        ogrenciList = new ArrayList<>();
    }

    public void rastgeleOgrenciSec(){

        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter(OgrenciSabitler.pathSecilmislerList);
            BufferedWriter writer=new BufferedWriter(fileWriter);

            BufferedReader reader=new BufferedReader(new FileReader(OgrenciSabitler.pathSecileceklerList));

            String ogrenci=ogrenciList.remove(rastgeleIndexDon());
            String deger=null;
            while ((deger=reader.readLine())!=null){
                if (deger.equals(ogrenci)){
                    System.out.println(deger);
                    writer.write(deger);
                    break;
                }
            }
            writer.flush();

            fileWriter = new FileWriter(OgrenciSabitler.pathSecileceklerList);
            BufferedWriter writer2=new BufferedWriter(fileWriter);
            for (String ogrenci1:ogrenciList){
                writer2.write(ogrenci1);
                writer2.newLine();
            }
            writer2.flush();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void listOlustur(){
        try {
            BufferedReader reader=new BufferedReader(new FileReader(OgrenciSabitler.pathSinifList));
            String deger=null;
            while ((deger=reader.readLine())!=null){
                ogrenciList.add(deger);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public void listedenDosyayaYaz(){
        try {
            FileWriter fileWriter=new FileWriter(OgrenciSabitler.pathSecileceklerList);
            BufferedWriter writer=new BufferedWriter(fileWriter);
            for (String ogrenci:ogrenciList){
                writer.write(ogrenci);
                writer.newLine();
            }
            writer.flush();

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public int rastgeleIndexDon(){
        return new Random().nextInt(0,ogrenciList.size());
    }




    public static void main(String[] args) {
        OgrenciFileIslemler x=new OgrenciFileIslemler();
        x.listOlustur();
//        x.listedenDosyayaYaz();
        x.rastgeleOgrenciSec();

//        System.out.println(ogrenciList);
    }
}
