package org.enes.lesson13;

/**
 * filmin bilgilerini gösteren bir metod yaz
 */

public class Movie {
    String adi;
    int cikisYili;
    double ortalamaPuani;
    String [] etiketler;
    String [] oyuncular;
    String yonetmen;
    String dili;
    String cekimYeri;
    String suresi;
    int[]puanlar=new int[30];

    public void etiketEkle(String etiket,int index){

        etiketler[index]=etiket;
    }

    public void puanEkle(int puan, int index){

        puanlar[index]=puan;
    }









}
