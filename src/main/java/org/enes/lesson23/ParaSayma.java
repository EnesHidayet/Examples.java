package org.enes.lesson23;

import java.util.Stack;

/*
      integer bir stack olu�turaca��z i�erisine 6-7 tane de�er ekleyelim
      100 den b�y�k olanlar� ba�ka bir stackde toplayal�m.
      100 den k���k olanlar� toplam�n� bulal�m.
 */
public class ParaSayma {
    public static void main(String[] args) {

        Stack<Integer>paralar=new Stack<>();
        Stack<Integer>yuzdenBuyukParalar=new Stack<>();
        int toplam=0;

        paralar.push(1);
        paralar.push(5);
        paralar.push(10);
        paralar.push(20);
        paralar.push(50);
        paralar.push(100);
        paralar.push(200);
        paralar.push(300);
        paralar.push(400);



        while (!paralar.isEmpty() ){
            if (paralar.peek()>100){
                yuzdenBuyukParalar.push(paralar.pop());
            }else {
                toplam+=paralar.pop();
            }
        }

        paralar.forEach(System.out::println);

        yuzdenBuyukParalar.forEach(System.out::println);

        System.out.println("Y�zden k���k paralar�n toplam�...:"+toplam);





    }
}
