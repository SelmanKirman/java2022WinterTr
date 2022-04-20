package day09_ternary_Switch;

import java.util.Scanner;

public class C06_ArtikYilNestedIfElse {

    public static void main(String[] args) {

        // Kullanicidan bir yil isteyin ve bu yilin artik yil mi artik yil degil mi oldugunu konsola yazdirin

        int yil;
        boolean artikYilMi;

        System.out.println("Lutfen bir yil giriniz");

        Scanner scan = new Scanner(System.in);
        yil = scan.nextInt();
        scan.close();

        if(yil % 4 == 0) {

            if(yil % 100 == 0) {

                if(yil % 400 == 0) {

                    artikYilMi = true;

                } else {

                    artikYilMi = false;

                }
            } else

                artikYilMi = true;
        } else

        artikYilMi = false;

        if(artikYilMi == true) {

            System.out.println("Girdiginiz yil artik bir yildir");
        }

        else

            System.out.println("Girdiginiz yil artik bir yil degildir");

    }

}


