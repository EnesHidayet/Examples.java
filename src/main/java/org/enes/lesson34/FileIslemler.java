package org.enes.lesson34;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Sabitleri tuttuðumuz bir sýnýfýmýz olsun daha sonra FileIslemleer sýnýfýna bir menü oluþturalým
 * 1-Dosya oluþtur.
 * 2-Dosya sil.
 * 3-Dosyaya veri ekle.
 * 4-Dosyadan veri oku.
 * 5-Dosyadaki bir harfi baþka bir harf ile deðiþtir.
 *
 * 1. soru için dosya oluþturmaya çalýþacaðýz daha önce oluþturulmamýþ ise
 * ===>dosyaismi adlý dosya baþarý ile oluþturuldu.
 * eðer daha önce var ise
 * ===>dosyaismi adlý dosya daha önce oluþturuldu.
 */
public class FileIslemler {
    Scanner scanner=new Scanner(System.in);
    public void fileMenu(){
    System.out.println("**** Dosya Yönetimi Menüsü ****");
    System.out.println("1- Dosya Oluþtur");
    System.out.println("2- Dosya Sil");
    System.out.println("3- Dosyaya Veri Ekle");
    System.out.println("4- Dosyadan Veri Oku");
    System.out.println("5- Dosyadaki Bir Harfi Baþka Bir Harf Ýle Deðiþtir.");
    System.out.println("0- ÇIKIÞ");
    }

    public void uygulama(){
        int secim=0;
        do {
            fileMenu();
            secim=Utility.intDegerAl("Lütfen bir iþlem seçiniz...");
            switch (secim){
                case 1:dosyaOlustur();break;
                case 2:dosyaSil2();break;
                case 3:veriEkle();break;
                case 4:veriOku2();break;
                case 5:veriUpdate2();break;
                case 0:
                    System.out.println("Çýkýþ yapýlýyor.");
                    break;
            }

        }while (secim!=0);
    }

    public void dosyaOlustur(){
        String dosyaIsmi=Utility.stringDegerAl("Oluþturmak istediðiniz dosyanýn ismi ve uzantýsýný giriniz.");
        Path myPath= Path.of(FileSabitler.path+dosyaIsmi);
        try {
            Files.createFile(myPath);
            System.out.println(dosyaIsmi+" isimli dosya baþarý ile oluþturuldu.");
        } catch (FileAlreadyExistsException e) {
            System.out.println(dosyaIsmi+" isimli dosya zaten daha önce oluþturulmuþ.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void dosyaOlustur2(){
        String dosyaIsmi=Utility.stringDegerAl("Oluþturmak istediðiniz dosyanýn ismi ve uzantýsýný giriniz.");
        File file=new File(FileSabitler.path+dosyaIsmi);

        try {
            if (file.createNewFile()){
                System.out.println(dosyaIsmi+" isimli dosya baþarý ile oluþturuldu.");
            }else {
                System.out.println(dosyaIsmi+" isimli dosya zaten daha önce oluþturulmuþ.");
            }

        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }

    public void dosyaSil(){
        String dosyaIsmi=Utility.stringDegerAl("Silinmesini istediðiniz doya adýný ve dosya uzantýsýný giriniz.");
        try {
            boolean kontrol=Files.deleteIfExists(Path.of(FileSabitler.path+dosyaIsmi));
            if (kontrol){
                System.out.println("Dosya baþarý ile silindi.");
            }else{
                System.out.println(dosyaIsmi+" isimli dosya bulunamadý.");
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public void dosyaSil2(){
        String dosyaIsmi=Utility.stringDegerAl("Silinmesini istediðiniz doya adýný ve dosya uzantýsýný giriniz.");
        File file=new File(FileSabitler.path+dosyaIsmi);

        boolean kontrol=file.delete();
        if (kontrol){
            System.out.println("Dosya baþarý ile silindi.");
        }else{
            System.out.println(dosyaIsmi+" isimli dosya bulunamadý.");
        }
    }

    public void veriEkle(){

        String dosyaIsmi=Utility.stringDegerAl("Veri eklemek istediðiniz dosya ismini ve uzantýsýný giriniz.");
        try {
            FileWriter fileWriter=new FileWriter(FileSabitler.path+dosyaIsmi,true);
            BufferedWriter writer=new BufferedWriter(fileWriter);
            String veri=Utility.stringDegerAl("Eklemek istediðiniz veriyi giriniz.");
            writer.write(veri);
            writer.newLine();
            writer.flush();
            System.out.println("Veri baþarý ile eklendi.");
        } catch (IOException e) {
            System.out.println(e.toString());;
        }

    }

    public void veriOku(){
        String dosya=Utility.stringDegerAl("Okunmasýný istediðiniz dosyanýn isim ve uzantýsýný giriniz.");
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
        String dosyaIsmi=Utility.stringDegerAl("lütfen veri okuyacagýnýz yapacagýnýz dosya ismini giriniz");
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
        String dosya=Utility.stringDegerAl("Üstünde deðiþiklik yapmak istediðiniz dosyanýn isim ve uzantýsýný giriniz.");
        try {
            FileWriter fileWriter=new FileWriter(FileSabitler.path+dosya,true);
            BufferedWriter writer=new BufferedWriter(fileWriter);

            BufferedReader reader=new BufferedReader(new FileReader(FileSabitler.path+dosya));
            String degistirilecek=Utility.stringDegerAl("Deðiþtirilmesini istediðiniz harfi giriniz.");
            String yeni=Utility.stringDegerAl("Deðiþtirilmesini istediðiniz harfin yerine yazýlacak harfi giriniz.");
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
        // metoddan donen arayin 0 indexdeki degeri metinimize karsýlýk gerli 1. indexdeki degeri ise dosya ismine
        String metin=array[0];

        String eskiHarf=Utility.stringDegerAl("Lütfen deðiþtirmek istediðniz harfi giriniz");
        String yeniHarf=Utility.stringDegerAl("Lütfen yeni harfi giriniz");
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
