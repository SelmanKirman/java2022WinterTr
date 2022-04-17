package day04_dataCasting_increment;

public class C04_ExplicitNarrowing {

    public static void main(String[] args) {

        int sayi1 = 879;
        double sayi2 = 10;


        double sayi3 = sayi1/sayi2;
        System.out.println(sayi3);

        int sayi4 = (int) (sayi1 / sayi2); // 87.9
        // deger double variable integer
        // java bunu oto yapmaz sorumluluku ustlenmemizi ister
        // sag tarafa yazdigimiz int sorumluluk bende demek

        System.out.println(sayi4); // 87


        int sayi5 = 140; // sag taraftaki deger int > sol taraftaki byte
        byte sayi6 =(byte) sayi5;
        System.out.println(sayi6);

        sayi5=129;
        sayi6 =(byte) sayi5;
        System.out.println(sayi6);

        sayi5=260;
        sayi6 =(byte) sayi5;
        System.out.println(sayi6);

        sayi5=520;
        sayi6 =(byte) sayi5;
        System.out.println(sayi6);

        sayi5=-130;
        sayi6 =(byte) sayi5;
        System.out.println(sayi6);

        sayi5=44 ;
        sayi6 =(byte) sayi5;
        System.out.println(sayi6);
    }
}
