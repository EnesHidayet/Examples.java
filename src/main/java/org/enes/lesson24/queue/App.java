package org.enes.lesson24.queue;

public class App {
    public static void main(String[] args) throws InterruptedException {
        PideKuyrugu pideKuyrugu=new PideKuyrugu();
        pideKuyrugu.musteriEkle();
//        pideKuyrugu.pideDagit();
//        pideKuyrugu.pideAlmayanlar();
//        Thread.sleep(2000);
//        pideKuyrugu.pideDagit();
//        pideKuyrugu.pideAlmayanlar();
//        Thread.sleep(2000);
//        pideKuyrugu.pideDagit();
//        pideKuyrugu.pideAlmayanlar();
//        Thread.sleep(2000);
//        pideKuyrugu.pideDagit();
//        pideKuyrugu.pideAlmayanlar();
//        Thread.sleep(2000);
//        pideKuyrugu.pideDagit();
//        pideKuyrugu.pideAlmayanlar();

        while (!pideKuyrugu.pideKuyrugu.isEmpty()){
            pideKuyrugu.pideDagit();
            pideKuyrugu.pideAlmayanlar();
        }
    }
}
