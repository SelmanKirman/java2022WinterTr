package day09_ternary_Switch;

import java.util.Scanner;

public class C07_ArtikYilIfElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int yil;
        System.out.println("Lutfen bir yil giriniz");
        yil = scan.nextInt();


        if (yil % 4 == 0 && yil % 100 != 0) {
            System.out.println("girdiginiz yil artik yildir");
        } else if (yil % 100 == 0 && yil % 400 == 0 ) {
            System.out.println("girdiginiz yil artik yildir");
        } else {
            System.out.println("girdiginiz yil artik yil degildir");
        }
    }
}
