package day07_ifElseStatements;

import java.util.Scanner;

public class C07_HaftaninGunleriIfElseIf {
    public static void main(String[] args) {

        //Kullanicidan gun ismini alin ve hafta ici veya haftasonu oldugunu yazdir
        // eger kullanici gun ismini yanlis girerse "Yanlis giris" yazdirin


        //String case sensitivedir
        // yani pazar , PAZAR , Pazar farkli kelimelerdir
        // bu durumda String methodlarinidan yardim aliriz
        // String icin equals methodunu kullanin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String gunIsmi = scan.next().toLowerCase();

        // hatali girisler yazdirmak icin
        // olasiliklari 3 e cikardim
        // hafta sonu hafta ici yanlis girs

        if(gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {

            System.out.println("girdiginiz gun haftasonu");


        } else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")) {


            System.out.println("girdiginiz gun hafta ici");


        } else {

            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }

        // eger if else if .... statement else ile bitiyorsa
        // olasiliklardan sadece bir tanesi calisir
        // java ilk buldugu true ya ait sonucu yazdirir
        // ve kalan sartlara bakmaz

        // if else if .... cumleleri else ile bitmese de calisir
        // ancak bu durumda sadece bir olasilik calisabilir VEYA hic bir islem yapilmayabilir

    }
}
