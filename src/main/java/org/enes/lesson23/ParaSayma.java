package org.enes.lesson23;

import java.util.Stack;

/*
      integer bir stack oluþturacaðýz içerisine 6-7 tane deðer ekleyelim
      100 den büyük olanlarý baþka bir stackde toplayalým.
      100 den küçük olanlarý toplamýný bulalým.
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

        System.out.println("Yüzden küçük paralarýn toplamý...:"+toplam);





    }
}
