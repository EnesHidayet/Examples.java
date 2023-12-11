package org.enes.lesson34;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Sabitleri tuttu�umuz bir s�n�f�m�z olsun daha sonra FileIslemleer s�n�f�na bir men� olu�tural�m
 * 1-Dosya olu�tur.
 * 2-Dosya sil.
 * 3-Dosyaya veri ekle.
 * 4-Dosyadan veri oku.
 * 5-Dosyadaki bir harfi ba�ka bir harf ile de�i�tir.
 *
 * 1. soru i�in dosya olu�turmaya �al��aca��z daha �nce olu�turulmam�� ise
 * ===>dosyaismi adl� dosya ba�ar� ile olu�turuldu.
 * e�er daha �nce var ise
 * ===>dosyaismi adl� dosya daha �nce olu�turuldu.
 */
public class FileIslemler {
    Scanner scanner=new Scanner(System.in);
    public void fileMenu(){
    System.out.println("**** Dosya Y�netimi Men�s� ****");
    System.out.println("1- Dosya Olu�tur");
    System.out.println("2- Dosya Sil");
    System.out.println("3- Dosyaya Veri Ekle");
    System.out.println("4- Dosyadan Veri Oku");
    System.out.println("5- Dosyadaki Bir Harfi Ba�ka Bir Harf �le De�i�tir.");
    System.out.println("0- �IKI�");
    }

    public void uygulama(){
        int secim=0;
        do {
            fileMenu();
            secim=Utility.intDegerAl("L�tfen bir i�lem se�iniz...");
            switch (secim){
                case 1:dosyaOlustur();break;
                case 2:dosyaSil2();break;
                case 3:veriEkle();break;
                case 4:veriOku2();break;
                case 5:veriUpdate2();break;
                case 0:
                    System.out.println("��k�� yap�l�yor.");
                    break;
            }

        }while (secim!=0);
    }

    public void dosyaOlustur(){
        String dosyaIsmi=Utility.stringDegerAl("Olu�turmak istedi�iniz dosyan�n ismi ve uzant�s�n� giriniz.");
        Path myPath= Path.of(FileSabitler.path+dosyaIsmi);
        try {
            Files.createFile(myPath);
            System.out.println(dosyaIsmi+" isimli dosya ba�ar� ile olu�turuldu.");
        } catch (FileAlreadyExistsException e) {
            System.out.println(dosyaIsmi+" isimli dosya zaten daha �nce olu�turulmu�.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void dosyaOlustur2(){
        String dosyaIsmi=Utility.stringDegerAl("Olu�turmak istedi�iniz dosyan�n ismi ve uzant�s�n� giriniz.");
        File file=new File(FileSabitler.path+dosyaIsmi);

        try {
            if (file.createNewFile()){
                System.out.println(dosyaIsmi+" isimli dosya ba�ar� ile olu�turuldu.");
            }else {
                System.out.println(dosyaIsmi+" isimli dosya zaten daha �nce olu�turulmu�.");
            }

        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }

    public void dosyaSil(){
        String dosyaIsmi=Utility.stringDegerAl("Silinmesini istedi�iniz doya ad�n� ve dosya uzant�s�n� giriniz.");
        try {
            boolean kontrol=Files.deleteIfExists(Path.of(FileSabitler.path+dosyaIsmi));
            if (kontrol){
                System.out.println("Dosya ba�ar� ile silindi.");
            }else{
                System.out.println(dosyaIsmi+" isimli dosya bulunamad�.");
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public void dosyaSil2(){
        String dosyaIsmi=Utility.stringDegerAl("Silinmesini istedi�iniz doya ad�n� ve dosya uzant�s�n� giriniz.");
        File file=new File(FileSabitler.path+dosyaIsmi);

        boolean kontrol=file.delete();
        if (kontrol){
            System.out.println("Dosya ba�ar� ile silindi.");
        }else{
            System.out.println(dosyaIsmi+" isimli dosya bulunamad�.");
        }
    }

    public void veriEkle(){

        String dosyaIsmi=Utility.stringDegerAl("Veri eklemek istedi�iniz dosya ismini ve uzant�s�n� giriniz.");
        try {
            FileWriter fileWriter=new FileWriter(FileSabitler.path+dosyaIsmi,true);
            BufferedWriter writer=new BufferedWriter(fileWriter);
            String veri=Utility.stringDegerAl("Eklemek istedi�iniz veriyi giriniz.");
            writer.write(veri);
            writer.newLine();
            writer.flush();
            System.out.println("Veri ba�ar� ile eklendi.");
        } catch (IOException e) {
            System.out.println(e.toString());;
        }

    }

    public void veriOku(){
        String dosya=Utility.stringDegerAl("Okunmas�n� istedi�iniz dosyan�n isim ve uzant�s�n� giriniz.");
        try {
            BufferedReader reader=new BufferedReader(new FileReader(FileSabitler.path+dosya));
            String deger=null;
            while ((deger=reader.readLine())!=null){
                System.out.println(deger);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String[] veriOku2(){
        String dosyaIsmi=Utility.stringDegerAl("l�tfen veri okuyacag�n�z yapacag�n�z dosya ismini giriniz");
        BufferedReader bufferedReader=null;
        String metin="";
        try {
            bufferedReader=new BufferedReader(new FileReader(FileSabitler.path+dosyaIsmi));
            String deger=null;

            while ((deger= bufferedReader.readLine())!=null){
                metin+=deger+"\n";
            }
        }catch (IOException e){
            System.out.println(e.toString());
        }
        metin=metin.substring(0,metin.length()-1);
        String [] array={metin,dosyaIsmi};
        return  array;
    }

    public void veriUpdate(){
        String dosya=Utility.stringDegerAl("�st�nde de�i�iklik yapmak istedi�iniz dosyan�n isim ve uzant�s�n� giriniz.");
        try {
            FileWriter fileWriter=new FileWriter(FileSabitler.path+dosya,true);
            BufferedWriter writer=new BufferedWriter(fileWriter);

            BufferedReader reader=new BufferedReader(new FileReader(FileSabitler.path+dosya));
            String degistirilecek=Utility.stringDegerAl("De�i�tirilmesini istedi�iniz harfi giriniz.");
            String yeni=Utility.stringDegerAl("De�i�tirilmesini istedi�iniz harfin yerine yaz�lacak harfi giriniz.");
            String deger=null;
            while ((deger=reader.readLine())!=null){
                if (deger.contains(degistirilecek)){
                    deger=deger.replace(degistirilecek,yeni);
                    writer.write(deger);
                    writer.newLine();
                    writer.flush();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void veriUpdate2() {
        String [] array=veriOku2();
        // metoddan donen arayin 0 indexdeki degeri metinimize kars�l�k gerli 1. indexdeki degeri ise dosya ismine
        String metin=array[0];

        String eskiHarf=Utility.stringDegerAl("L�tfen de�i�tirmek istedi�niz harfi giriniz");
        String yeniHarf=Utility.stringDegerAl("L�tfen yeni harfi giriniz");
        metin=metin.replace(eskiHarf,yeniHarf);

        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter =new BufferedWriter(new FileWriter(FileSabitler.path+array[1]));
            bufferedWriter.write(metin);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
