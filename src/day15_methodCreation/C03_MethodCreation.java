package day15_methodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {

        // kullancidan bir kelime isteyin
        // eger kelime 3 harften kisa ise "kelime cok kisa" yazdirin
        // eger kelime 3,4 veya 5 harfli ise harf sayisini ve
        // kelimenin tersten yazilisini yazdirin
        // eger 5 harften uzunsa "" kelime cok uzun " yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next();
        String tersKelime="";
        int harfsayisi=kelime.length();

        if (harfsayisi<3) {
            System.out.println("kelime cok kisa");
        }else if (harfsayisi==3) {
            ucHarfiTersineCevir(kelime);
        }else if (harfsayisi==4) {
            dortHarfiTersineCevir(kelime);
        }else if (harfsayisi==5) {
            besHarfiTersineCevir(kelime);
        } else {
            System.out.println("kelime cok uzun");
        }

}

    private static void besHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(4) +
                kelime.substring(3,4) +
                kelime.substring(2,3) +
                kelime.substring(1,2) +
                kelime.substring(0,1);

        System.out.println("girdiginiz kelimedeki harg sayisi : " + kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);

    }

    private static void dortHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(3) +
                kelime.substring(2,3) +
                kelime.substring(1,2) +
                kelime.substring(0,1);

        System.out.println("girdiginiz kelimedeki harg sayisi : " + kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);

    }

    private static void ucHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(2) +
                kelime.substring(1,2) +
                kelime.substring(0,1);

        System.out.println("girdiginiz kelimedeki harg sayisi : " + kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);

    }

}


    // 1- method olusturmak icin methodun adini yazariz
    // 2- methoda giderken goturmem gerek variable varsa, bunu methoda eklemeliyim



