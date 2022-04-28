package day18_nestedForLoop;

public class C03_NestedForLoop {

    public static void main(String[] args) {

        /* Kullanicidan sayi iste
        *
        * *
        * * *
        * * * *
        * tabloyu olustur
         */

        int input = 5;

        for (int i = 0; i < 5 ; i++) {

            for (int j = 0; j <= i ; j++) {
                // nested for loop ya diktortgen ya da ucgen formatinda olabilir
                // dikdortgen isteginizde iki loop icin de bagimsiz en point belirleriz
                // ucgen sekli vermek icin inner loopun end pointini olarak outer degiskene baglariz
                System.out.print("* ");

            }

            System.out.println();

        }
    }
}
