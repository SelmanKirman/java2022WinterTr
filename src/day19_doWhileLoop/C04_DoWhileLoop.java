package day19_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        // Kullanıcıdan toplamak uzere pozıtıf sayılar ısteyın
        // islemi bitirmek icin 0 a basmasini soyleyin
        // kullanci yanlislikla negative sayi girerse o sayiyi dikkate almayin
        // ve " Negatif sayi giremezsin" yazdirip basa donun
        // Kullanici 0 a bastiginda toplam kac pozitif sayi girdigini
        // yanlislikla kac negative sayi girdigini
        // ve girdigi pozitif sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        int sayi=1;
        int toplam=0;
        int sayacPozitif=0;
        int sayacNegatif=0;

        do {
            System.out.println("Lutfen pozitif bir tam sayi girin\nbitirmek icin 0'a basin");
            sayi= scan.nextInt();
            if(sayi<0) {
                System.out.println("Negatif sayi giremezsiniz");
                sayacNegatif++;
            }else if( sayi > 0) {
                toplam+=sayi;
                sayacPozitif++;
            }
        } while (sayi!=0);
        System.out.println("yanlislikla girilen negatif sayi adedi : " + sayacNegatif);
        System.out.println("girilen pozitif sayi adedi : " + sayacPozitif);
        System.out.println("girilen pozitif sayilarin toplami : " + toplam);
    }
}
