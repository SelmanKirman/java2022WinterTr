package day02_variables;

public class C03_Variables {

    public static void main(String[] args) {

            String ogrenciIsmi="Melih";

            ogrenciIsmi="Furkan";

            // Bir variable deklare edildikten sonra istedigimiz kadar deger degisimi yapabiliriz
            // Ancak deklare edilen bir variable tekrar deklare edilmez

            // String ogrenciIsmi = "Abdullah"

        String isim, soyIsim, dogumYeri;

        isim="Nihad";
        soyIsim="ozel";
        dogumYeri="Ankara";

        System.out.println(dogumYeri);
        System.out.println(soyIsim);

        String tcNo="12345678901";
        String hiclik="";

        // String non-primitive oldugu icin biz sadece data saklamak degil
        // ekstra ozellikleri de kullanabiliyoruz
        // Eger Tc No, okulNumarasi veya Tel numarasi gibi
        // kendisi sayisal olan ancak matematiksel bir islemde kullanilmayan
        // degerler icin kullanabilriz


        String harf="A";
        char harf2='A';

    }
}
