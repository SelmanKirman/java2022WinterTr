package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        // String kullaniciIsmi = scan.next();// sadece ilk kelimeyi alir // Ilk space e kadar

        String kullaniciIsmi = scan.nextLine();// satir sonuna kadar girilen tum degerleri alir
        System.out.println("Kullaniicinin girdihi isim : " + kullaniciIsmi);

    }
}
