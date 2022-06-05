package day39_overriding;

public class Corolla extends Toyota{

    protected String hiz="Corolla max hiz yapar";
    protected String yakit="Corolla benzinli ve elektriklidir";
    protected String model="Corolla";
    public void motor(){
        System.out.println("Corolla araclar cevreci motor kullanir");
    }

    public void yakitTuketimi(){
        System.out.println("Corolla 5.6 lt yakit tuketir");
    }

    public void vitesSayisi(){
        System.out.println("Corolla 5 viteslidir");
    }

    public static void main(String[] args) {

        /*
        Data turu ve cons farkli oldugundan
        Cons calistigi icin obje
        Cons in oldugu class ozelliklerini tasir
        Ancak Data turu Parent class secildigi icin
        variable'lar data turunun secildigi class ve
        onun parent classlarindan deger alabilir

        Methodlar icin ise yine data turunun oldugu classa gideriz
        ancak direk methodu calistirmadan once
        method Override edilmismi diye kontrol ederiz
         */

        Corolla arb1 = new Corolla();
        System.out.println(arb1.hareket); // araba
        System.out.println(arb1.hiz); // Corolla
        System.out.println(arb1.yakit); // Corolla
        System.out.println(arb1.marka); // Toyota
        System.out.println(arb1.sirketMerkezi); // Toyota
        System.out.println(arb1.model); // Corolla
        arb1.motor(); // Corolla
        System.out.println("******************************");


        Toyota arb2 = new Corolla();
        System.out.println(arb2.hareket); // Araba
        System.out.println(arb2.hiz); // Toyota
        System.out.println(arb2.yakit); // Araba
        System.out.println(arb2.marka); // Toyota
        System.out.println(arb2.sirketMerkezi); // Toyota
        // System.out.println(arb2.model); // CTE
        arb2.motor(); // COROLLA
        arb2.garanti(); // TOYOTA
        arb2.yakitTuketimi(); // COROLLA
        // arb2.vitesSayisi(); // Data turu olan Toyota dan baslayinca
        // boyle bir method bulamadik CTE
        System.out.println("******************************");


        Araba arb3 = new Corolla();
        System.out.println(arb3.hareket); // Araba
        System.out.println(arb3.hiz); // Araba
        System.out.println(arb3.yakit); // Araba
        System.out.println(arb3.marka); // Araba
        // System.out.println(arb3.sirketMerkezi); // CTE
        // System.out.println(arb2.model); // CTE

        arb3.yakitTuketimi(); // COROLLA
        arb3.motor(); // COROLLA
        // arb3.garanti(); CTE Aramaya Araba classindan basladi ve methodu bulamadi

        // arb3.vitesSayisi();// CTE
        System.out.println("******************************");

    }
}
