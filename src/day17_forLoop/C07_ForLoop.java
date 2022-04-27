package day17_forLoop;

import java.util.Scanner;

public class C07_ForLoop {
    public static void main(String[] args) {
        // Soru 6) Interview Question Kullanicidan 100 den kucuk bir tamsayi isteyin 1 den baslayip
        // -Sayi 3 un kati ise sayi yerine "Java" yazdirin
        // -Sayi 5'in kati ise sayi yerine "Güzeldir" yazdirin
        // -Sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir" yazdirin

        System.out.println("Lutfen 100 den kucuk bir tam sayi giriniz");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        for (int i = 0; i <=sayi ; i++) {

            if(i%3==0) {
                if (!(i % 5 == 0)) {
                    System.out.println(i+" .)Java");
                } else if (i % 5 == 0) {
                    System.out.println(i+" .)Java Guzeldir");
                }
            }   else if (i%5==0) {
                    System.out.println(i+" .)Guzeldir");
                }
            else
                System.out.println(i);
            }

        int sayi2=60;

        for (int i = 0; i < sayi2; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println(i + " Java Guzeldir");
            } else if(i%5==0) {
                System.out.println(i + " Guzeldir");
            } else if(i%3==0) {
                System.out.println(i + " Java");
            } else {
                System.out.println(i);
            }


        }


        }
    }

