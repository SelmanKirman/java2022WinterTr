package day19_doWhileLoop;

public class C05_Scope {
    // 1- Method icerisinde olusturulan variable'lar sadece olusturulduklari
    // methodda kullanilabilirler, baska methodlarda kullanilamazlar
    // 2- Tum methodlarin kullanabilmesini istedigimiz variable'lari
    // Class level'da olustururuz
    // Class level'da olusturdugumuz variable'i
    // -- static yaparsak tum methodlar kullanabilir
    // -- static olmazsa(instance)
    // 3- Loop icerisinde olusturulan variablelar loop icersinde kullanilabilir
    //    ama loop'un disinda kullanilamaz

    static String kurs="Java";
    int level=10;
    static int sayi4;


    public static void main(String[] args) {

        int sayi=10;
        // isim = "Veli Yan";
        System.out.println(kurs);
        // System.out.println(level);

        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            int loopSayi=20;
        }

        // System.out.println(i);
        // loopSayi=30;

        int sayi2;

        sayi4++;// class seviyesinde olusturup deger atamadigim sayi4'u arttirmamam java itiraz etmiyor
        // sayi2++;// ama method icinde olusturup deger atamadigim sayiyi arttirmaya java izin vermiyor
    }

    public static void method1() {
        // sayi=20;
        String isim="Ali Can";
        System.out.println(kurs);
        // System.out.println(level);



    }

    public void method2() {

        // sayi=30;
        // isim="Ayse San";
        System.out.println(kurs);
        System.out.println(level);


    }
}
