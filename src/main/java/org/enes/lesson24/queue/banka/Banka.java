package org.enes.lesson24.queue.banka;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Banka {

    Comparator<Musteri> comparator=new Comparator<Musteri>() {
        @Override
        public int compare(Musteri o1, Musteri o2) {
            return o2.getSiraNo()-o1.getSiraNo();
        }
    };

    Queue<Musteri> musteriler=new PriorityQueue<>(comparator);

    public void kurugaMusteriEkle(){
        musteriler.offer(new Musteri("Enes",5,false));
        musteriler.offer(new Musteri("Mustafa",1,true));
        musteriler.offer(new Musteri("Kemal",2,true));
        musteriler.offer(new Musteri("Atatürk",3,false));
        musteriler.offer(new Musteri("Sabiha",6,false));
        musteriler.offer(new Musteri("Gökçen",4,true));
        musteriler.offer(new Musteri("Aslan",7,true));
    }

    public void kuyruguYazdir(){
        while (!musteriler.isEmpty()){
            System.out.println(musteriler.poll());
        }
    }

    public static void main(String[] args) {
        Banka banka=new Banka();
        banka.kurugaMusteriEkle();
        banka.kuyruguYazdir();
    }

}
