package org.enes.lesson07;

public class Question37 {
    public static void main(String[] args) {

        /**
         * içerisinde 1 ve 4 ün kaç kere geçtiðini sayýp
         * 1 sayýsýnýn adeti 4 sayýsýnýn adetinden büyük ise true deðil ise false yazalým
         */
        int[] sayilar = { 1,4, 4, 4, 1, 1, 4, 8 };
        int birIcin=0;
        int dortIcin=0;
        for (int i=0;i<sayilar.length;i++){

            if (sayilar[i]==1){
                birIcin++;
            }else if (sayilar[i]==4){
                dortIcin++;
            }

        }
        boolean kontrol=true;
        if (birIcin>dortIcin){
            System.out.println(kontrol);
        }else if (dortIcin>birIcin){
            kontrol=false;
            System.out.println(kontrol);
        }else if (birIcin==dortIcin){
            System.out.println("Eþit adette bulunmaktalar");
        }

    }
}
