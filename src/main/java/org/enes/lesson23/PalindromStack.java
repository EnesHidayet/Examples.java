package org.enes.lesson23;

import java.util.Scanner;
import java.util.Stack;

/*
    dýþarýdan bir kelime alýp keimeyi bir stacke ekleyelim daha sonra
    stack üzerinde çalýþýp kelimenin palindrom olup olmadýðýný kontrol edelim.
 */
public class PalindromStack {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen palindrom olup olmadýðýný merak ettiðiniz ifadeyi giriniz...:");
        String ifade=scanner.nextLine();

        Stack<Character> stack=new Stack<>();
        char[] array=ifade.toCharArray();
        //string ifadeden bir stack oluþturduk.
        for (int i=0;i<array.length;i++){
            stack.push(array[i]);
        }

        String tersKelime="";


        while (!stack.isEmpty()){
            tersKelime+=stack.pop();
        }

        if (ifade.equals(tersKelime)){
            System.out.println("Polindromdur.");
        }else System.out.println("Polindrom deðildir.");







    }



}
