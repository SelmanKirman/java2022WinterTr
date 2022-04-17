package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cemberin yaricapini giriniz");
        double yaricap= scan.nextDouble();

        System.out.println("Girdiginiz yaricap : " + yaricap);
        System.out.println("Cemberin cevreisi : " + 2*3.14*yaricap);
        System.out.println("Dairenin alani : " + 3.14*yaricap*yaricap);
    }
}
