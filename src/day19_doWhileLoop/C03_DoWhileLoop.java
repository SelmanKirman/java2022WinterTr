package day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        // kullancidan pozitif bir tam sayi alip
        // while loop ile sayidan kucuk pozitif tam sayilari yazdiralim

        int input=3;

        int sayi=1;
        int sayac=1;

        while(sayi<input) {
            System.out.println(sayi);
            sayac++;
            sayi++;
        }

        System.out.println("sayac : " + sayac);

        // Ayni soruyu do-while loop ile yapalim

        sayi=1;
        do {
            System.out.println(sayi);
            sayi++;
        } while (sayi<input);
    }
}
