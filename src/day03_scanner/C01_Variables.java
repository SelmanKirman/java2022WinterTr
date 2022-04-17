package day03_scanner;

public class C01_Variables {
    public static void main(String[] args) {

        String okulIsmi="Yildiz Koleji";
        System.out.println(okulIsmi);

        char ilkHarf;
        ilkHarf = 'K';
        System.out.println(ilkHarf);

        int sayi1=10, sayi2=20;
        System.out.println(sayi1+sayi2);

        String isim="Nezir";
        String soyIsim="Disiacik";

        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyIsim);

        short sayi3 = 20;
        double sayi4 = 30;

        System.out.println("iki sayinin toplami : " + (sayi3 + sayi4));

        char ozelKarakter='m';
        System.out.println(ozelKarakter);

        int sayi5=20;
        char harf='a';

        System.out.println(sayi5+harf);
        //char data turundeki degiskenler matematiksel kullanilirsa
        // o char degerinin ASCII karsiligi isleme alinir

        int sayi6 = 'a';
        System.out.println(sayi6);
    }
}
