package org.enes.lesson23;

import java.util.Scanner;
import java.util.Stack;

/*
    d��ar�dan bir kelime al�p keimeyi bir stacke ekleyelim daha sonra
    stack �zerinde �al���p kelimenin palindrom olup olmad���n� kontrol edelim.
 */
public class PalindromStack {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("L�tfen palindrom olup olmad���n� merak etti�iniz ifadeyi giriniz...:");
        String ifade=scanner.nextLine();

        Stack<Character> stack=new Stack<>();
        char[] array=ifade.toCharArray();
        //string ifadeden bir stack olu�turduk.
        for (int i=0;i<array.length;i++){
            stack.push(array[i]);
        }

        String tersKelime="";


        while (!stack.isEmpty()){
            tersKelime+=stack.pop();
        }

        if (ifade.equals(tersKelime)){
            System.out.println("Polindromdur.");
        }else System.out.println("Polindrom de�ildir.");







    }



}
