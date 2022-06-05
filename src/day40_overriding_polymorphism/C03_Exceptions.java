package day40_overriding_polymorphism;

import java.util.Scanner;

public class C03_Exceptions {

    public static void main(String[] args) {
        // Kullanicidan iki sayi alip, bolerek
        // sonucu yazdiran bir program yazdiriniz


        Scanner scan = new Scanner(System.in);

        int kontrol=0;
        while(kontrol != 2){

            System.out.println("Bolmek istediginiz sayiyi yaziniz");
            int sayi1= scan.nextInt();

            System.out.println("Kaca bolmek istediginizi yaziniz");
            int sayi2= scan.nextInt();


            try {
                System.out.println("sonuc = " + sayi1 / sayi2);
            } catch (ArithmeticException e) {
                // e.printStackTrace();
                System.out.println("Girdiginiz sayilarda sorun var");
            }

            System.out.println("devam etmek icin 1 \n bitirmek icin  2 ye basin");
            kontrol=scan.nextInt();
        }


        /*
        Sayi2 0 oldugundan  sayi1/0 olacagindan
        Java bu durumla karsilasinca exception verir
        Javanin yazdigi mesajda exception ne tur bir sorun oldugu
        neden kaynaklandigi
        ve hangi satirda olustugu yazar
        Exceotion in thread "main" java.lang.ArithmeticException: / by zero
        at day40_overriding_polymorphism.C03_Exceptions.main(C03_Exceptions.java:20)

        bunu cozmek icin sayi2yi if ile kontrol edebiliriz
         */

        /*

        if (sayi2==0) {
            System.out.println("Sayi / 0 tanimsizdir");
        } else {
            System.out.println("sonuc = " + sayi1 / sayi2);
        }

        Ama bu yontem her sorunda calismaz
         */


    }
}
