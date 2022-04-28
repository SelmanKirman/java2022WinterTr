package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class H_sayiBulmaca {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // gitilen her tahminde sayiyi buyut veya kucult diye kullanciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullanciya yazdirin


        System.out.println("Lutfen 1 ile 100 arasinda Bir sayi giriniz");
        Scanner scan = new Scanner(System.in);
        int tahmin = scan.nextInt();
        int min = 1;
        int max = 100;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;
        int sayac = 1;


        while (!(tahmin == rand)) {

            if (tahmin < rand) {
                System.out.println(sayac + ".tahmin = " + tahmin);
                System.out.println("Girdiginiz sayiyi buyultun");
                tahmin = scan.nextInt();
                sayac++;

            } else if (tahmin > rand) {
                System.out.println(sayac + ".tahmin = " + tahmin);
                System.out.println("Girdiginiz sayiyi kucultun");
                tahmin = scan.nextInt();
                sayac++;
            }
        }


        System.out.println("bilgisayarin random tuttugu sayiyi " + sayac + " tahminde buldunuz ve bu sayi " + rand);

        Random rnd = new Random();
        int sayi = rnd.nextInt(100);

        Scanner scann = new Scanner(System.in);
        int tahminn = 0;
        System.out.println(sayi);
        int sayacc = 0;

        while (sayi != tahmin) {
            System.out.println("Lutfen bir sayi giriniz");
            tahmin = scan.nextInt();

            if (tahmin > sayi) {
                System.out.println("Daha kucuk bir sayi soylemelisin");

            } else if (tahmin < sayi) {
                System.out.println("Daha buyuk bir sayi soylemelisin");
            }
            sayacc++;
        }

        System.out.println("Tuttugun sayiyi " + sayacc + " tahminde buldunuz");

    }
}

