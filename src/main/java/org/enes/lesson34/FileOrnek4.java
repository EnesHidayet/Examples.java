package org.enes.lesson34;

import java.io.*;

public class FileOrnek4 {
    static String path="C:\\Users\\enesh\\Desktop\\fileOrnek\\deneme.txt";
    public static void main(String[] args) {

        BufferedReader reader=null;
        BufferedWriter writer=null;
        //Yazma iþlemi
        try {
            FileWriter fileWriter=new FileWriter(path,true);//buraya true eklenirse eski yazýlanlarý korur.
            writer=new BufferedWriter(fileWriter);
            writer.write("Deneme\n");
            writer.write("Deneme2");
            writer.newLine();
            writer.write("Deneme3");
            writer.newLine();
            writer.write("Deneme4");
            writer.newLine();
//            writer.write("xyza",1,1);// off deðeri index deðeerine karþýlýk gelir o indexden itibaren len deðeri kadar eleman yazdýrýr. 1. indexten itibaren 1 tane deðer yazdýrýr
//            writer.append("xyzab",1,3);// star baþlangýc indexi end bitiþ indexi olarak görev alýr.Substring gibi.
            writer.flush();
            writer.write("Deneme5");
            writer.newLine();
            writer.write("Deneme6");
            writer.newLine();
        }catch (IOException e){
            throw new RuntimeException(e);
        }finally {
            try {
                Thread.sleep(1000);
                writer.close();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //Okuma iþlemi

        try {
            reader=new BufferedReader(new FileReader(path));
            BufferedReader reader2=new BufferedReader(new FileReader(path));
//            System.out.println((char) reader.read());
//            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());
//            System.out.println(reader.readLine());
//            System.out.println(reader2.readLine());
            String deger = null;
            while ((deger = reader.readLine())!=null){
                System.out.println(deger);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
