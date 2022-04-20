package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {
        // Kullanicidan 4 basamakli bir sayi girmesini isteyin. Girdigi sayi 5'e
        // bolunuyorsa son rakamini kontrol edip, Son rakimi 0 ise ekrana 5'e bolunen
        // cift sayi" yazdirin. Son rakami 0 degil ise "5'e bolunen tek sayi yazdirin.
        // Girdigi password 5'e bolunuyorsa ekrana "Tekrar deneyin" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli pozitif bir sayi giriniz");
        Double sayi1 = scan.nextDouble();

        if (sayi1 < 1000 || sayi1 > 9999) {// Istenmeyen durumu yaziyoruz

            System.out.println("Lutfen 4 basamakli bir sayi giriniz");

        } else if (sayi1 % 5 == 0) { // 4 basamakli ve sayi 5 e tam bolunur

            if (sayi1 % 10 == 0) { // 4 basamakli 5 ile bolunebilien ve son rakami 0
                System.out.println("5 e bolunebilen cift sayi");

            } else { // 4 basamakli ve 5 ile bolunebilen son rakami 0 olmayan

                System.out.println("5 e bolunebilen tek sayi");
            }

            } else { // 4 basamakli 5'e bolunemiyor

                System.out.println("Tekrar deneyin");
                ;
            }
        }
    }

