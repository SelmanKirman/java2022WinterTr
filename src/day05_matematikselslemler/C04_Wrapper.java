package day05_matematikselslemler;

import java.util.Locale;

public class C04_Wrapper {
    public static void main(String[] args) {

        String str="Java";
        int sayi=10;


        System.out.println(str.toUpperCase()); // JAVA
        System.out.println(str);//Java

        // non-primitve data türleri data depolamak yaninda bircok faydali methoda sahiptir
        // ancak primitve data türlerinin boyle bir ozellikleri yoktur sadece degerleri saklarlar

        // primitive data turleri icinde bazi methodlar gerekli oldugunda
        // java ara bir cozum uretmistir
        // java her bir primitive data turunu non-primitive olarak kullanabilmek icin
        // ozel Classlar olusturmustur ve bunlara Class adini vermistir

        double sayi2 = 20.5;

        // sayi2 primitive oldugundan sayi2 dedigimizde hicbir method gelmez

        Double sayi3= 15.2;

        // sayi3 wrapper Class olan Double Classini kullandigindan
        // sayi3. dedigimizde bircok method gelir



    }
}
