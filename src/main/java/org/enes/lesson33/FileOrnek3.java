package org.enes.lesson33;

import org.enes.lesson32.Liman;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOrnek3 {
    static String path="C:\\Users\\enesh\\Desktop\\fileOrnek\\2.jpg";
    static List<Integer> list=new ArrayList<>();

    public static void main(String[] args) {

        dosyadanVeriOkuma();
        dosyayaVeriYazma("C:\\Users\\enesh\\Desktop\\fileOrnek\\3.jpg");
        dosyayaVeriYazma("C:\\Users\\enesh\\Desktop\\fileOrnek\\yeniKopya.png");
        dosyayaVeriYazma("C:\\Users\\enesh\\Desktop\\fileOrnek\\yeniKopya2.jpeg");

    }

    public static void dosyadanVeriOkuma(){
        try {
            FileInputStream fis=new FileInputStream(path);
            int deger;
            while ((deger=fis.read())!=-1){
                System.out.println((char) deger);
                list.add(deger);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void dosyayaVeriYazma(String path){
        try {
            FileOutputStream fos=new FileOutputStream(path);
            for (Integer deger:list){
                fos.write(deger);
            }

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
