package day05_matematikselslemler;

import java.util.Scanner;

public class C03_RakarmlarToplaminiBulma {
    public static void main(String[] args) {
        // kullanicidan aldiginiz 4 basamakli bir sayinin
        // basamalaklardaki rakamlar toplamini bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir tamsayi giriniz");
        int sayi= scan.nextInt();
        int rakam = 0;
        int rakamlarToplami = 0;

        rakam=sayi%10; // birler basamagi
        rakamlarToplami += rakam;
        sayi/=10; // birler basamagi kaybeder

        rakam=sayi%10;
        rakamlarToplami += rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami += rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami += rakam;
        sayi/=10;

        System.out.println("girdiginiz sayinin rakamlar toplami " + rakamlarToplami);



    }
}
