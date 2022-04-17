package day05_matematikselslemler;

public class C06_WrapperClass {
    public static void main(String[] args) {

        String str1="12345";
        String str2="23456";


        // verilen 2 string'deki sayilari toplayin

        System.out.println(str1 + str2);

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));
        System.out.println(Integer.valueOf(str1+str2));

        int sayi3 = (int) Integer.valueOf(str1);
        System.out.println(sayi3);

        // Integer.valueOf(str1) methodu sadece sayisal deger iceren Stringlerde kullanilabilir
        // bir tane bile sayi disinda karakter olursa Java hata verir
    }
}
