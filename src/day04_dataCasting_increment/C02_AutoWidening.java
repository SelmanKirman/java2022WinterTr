package day04_dataCasting_increment;

public class C02_AutoWidening {

    public static void main(String[] args) {

        boolean dogruMu=true;
        // String str=dogruMu;
        byte sayi1 = 44;

        System.out.println(sayi1);

        short sayi2 = sayi1; //

        System.out.println(sayi2); // Autowidening

        double sayi3 = sayi2;

        System.out.println(sayi3 );
    }
}
