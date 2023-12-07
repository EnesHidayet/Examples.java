package org.enes.lesson31;

/**
 * CheckedException --> kontrol edilmesi zorunlu exception t�rleridir. extend olarak Exceptionlar� al�rlar
 *
 *
 * UnCheckedException--> kontrol zorunlulu�u olmayan exceptionlard�r.extend olarak RunTimeException s�n�f�n� al�rlar.
 */
public class InfinityTest {

    public static void bolme2(Double bolunen,Double bolen){
        if (bolen==0){
            throw new InfinityException();
        }
            double bolum=bolunen/bolen;
            System.out.println("sonuc==>"+bolum);

    }

    public static Integer toplamaYap(Integer sayi1,Integer sayi2) throws EksiDegerException {
        if (sayi1<0 || sayi2<0){
            throw new EksiDegerException("Girilen say�lar� pozitif tam say� de�il.");
        }
        return sayi1+sayi2;
    }

    public static void main(String[] args){
//        try {
//            bolme2(50D,0D);
//        }catch (InfinityException exception){
//            System.out.println("Hata olustu:"+ exception.getMessage()+"==> Bir say� 0 a b�l�nemez");
//        }


//        try {
//            System.out.println( toplamaYap(5,10));
//        }catch (EksiDegerException exception){
//            System.out.println("Negatif say�lar� toplayamam hoca istemiyor.");
//        }

        bolme2(50D,1D);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println(  toplamaYap(50,-60));
        } catch (EksiDegerException e) {
            System.out.println(e.toString());
        }




    }
}
