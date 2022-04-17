package day03_scanner;

public class C03_SwapVariablesTempOlmadan {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;

        System.out.println("Once sayi1 : " + sayi1 + " Once sayi2 : " + sayi2);

        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2; // sayi1
        sayi1 = sayi1 - sayi2;

        System.out.println(" Sonra sayi1 : " + sayi1 + " Sonra sayi2 : " + sayi2);
    }
}
