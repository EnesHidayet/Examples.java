package org.enes.lesson03;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        System.out.println("Doğum ayınızı giriniz");
        int ay=new Scanner(System.in).nextInt();
        System.out.println("Doğum gününüzü yazınız");
        int gun=new Scanner(System.in).nextInt();
        if ((ay==1 && gun>=22) || (ay==2 && gun<=19)){
            System.out.println("Kova burcusunuz");
        }else if ((ay==2 && gun>=20) || (ay==3 && gun<=20)){
            System.out.println("Balık burcusunuz");
        }else if ((ay==3 && gun>=21) || (ay==4 && gun<=20)){
            System.out.println("Koç burcusunuz");
        } else if ((ay==4 && gun>=21)||(ay==5 && gun<=21)) {
            System.out.println("Boğa burcusunuz");
        }else if ((ay==5 && gun>=22)||(ay==6 && gun<=22)){
            System.out.println("İkizler burcusunuz");
        } else if ((ay==6 && gun>=23)||(ay==7 && gun<=22)) {
            System.out.println("Yengeç burcusunuz");
        } else if ((ay==7 && gun>=23)||(ay==8 && gun<=22)) {
            System.out.println("Aslan burcusunuz");
        } else if ((ay==8 && gun>=23)||(ay==9 && gun<=22)) {
            System.out.println("Başak burcusunuz");
        } else if ((ay==9 && gun>=23)||(ay==10 && gun<=22)) {
            System.out.println("Terazi burcusunuz");
        } else if ((ay==10 && gun>=23)||(ay==11 && gun<=21)) {
            System.out.println("Akrep burcusunuz");
        } else if ((ay==11 && gun>=22)||(ay==12 && gun<=21)) {
            System.out.println("Yay burcusunuz");
        } else if ((ay==12 && gun>=22)||(ay==1 && gun<=21)){
            System.out.println("Oğlak burcusunuz");
        } else{

        }//else

    }//main
}//class
