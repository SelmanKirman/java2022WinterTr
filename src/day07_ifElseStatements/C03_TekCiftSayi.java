package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {

        // Sayi iste kullanicidan tek mi cift mi yazdir konsola

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        if(sayi%2 == 0) {
            System.out.println("girilen sayi cift sayidir");
        }

        if(sayi%2 == 1) {
            System.out.println("girilen sayi tek sayi");
        }

        // normalde bir tamsayi ya tektir veya cifttir
        // o aman tek olmasi veya cift olmasi iki ayri if ile degil
        // if else ile tek statement 'da yapmak daha guzel olur
        // ======= if else ile cozum =======

        if ( sayi%2==0) {
            System.out.println("girdiginiz sayi cift sayidir");
        } else {
            System.out.println("girdiginiz sayi tek sayidir");
        }
    }
}
