package org.enes.lesson02;

public class Question4 {
    public static void main(String[] args) {

        //for
        for (int i=0; i<7; i++){

            System.out.println("Enes ASLAN");

        }
        //veya tek satırlık kod için böyle yazılabilir.
        for (int i=0; i<7; i++) System.out.println("Enes ASLAN");

        //while
        int sayac=0;
        while (sayac<7)
        {

            System.out.println("Enes ASLAN");
            System.out.println(sayac);
            sayac++;

        }

        //dowhile
        sayac=0;
        do {

            sayac++;
            System.out.println("Enes");

        }while (sayac<7);

    }
}
