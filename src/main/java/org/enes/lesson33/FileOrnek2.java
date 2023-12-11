package org.enes.lesson33;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;

public class FileOrnek2 {
/*
        output yazma
        input okuma
 */
    static String path="C:\\Users\\enesh\\Desktop\\fileOrnek\\deneme.txt";
    public static void main(String[] args) {
        File file=new File(path);

        //Yazma iþlemi output
        FileOutputStream fos=null;

        try {
            fos=new FileOutputStream(file,true);
//            fos.write(74);
//            fos.write(65);
//            fos.write(86);
//            fos.write(65);

//            byte[] array={74,65,86,65};
//            fos.write(array);

            String kelime=" -java";
//            fos.write(kelime.getBytes(),1,2); // substring benzeri çalýþýyor.


        } catch (IOException e) {
            System.out.println(e.toString());
        }finally {
            try {
                fos.close();
            } catch (FileNotFoundException e) {

            } catch (IOException e) {

            }
        }

        //Okuma iþlemi input
        FileInputStream fis=null;
        try {
            fis=new FileInputStream(file);
//            System.out.println((char) fis.read());
//            System.out.println((char) fis.read());
//            System.out.println((char) fis.read());
//            System.out.println((char) fis.read());
//            System.out.println((char) fis.read());
//            System.out.println(fis.read());
            //1. yöntem
//            System.out.println(Arrays.toString(fis.readAllBytes()));
            //2. yöntem
            int deger;
            while ((deger=fis.read())!=-1){
                System.out.println((char) deger);
            }


        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }





    }
}
