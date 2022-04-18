package day07_ifElseStatements;

import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {

        //Kullanicidan gun ismini alin ve hafta ici veya haftasonu oldugunu yazdir


        //String case sensitivedir
        // yani pazar , PAZAR , Pazar farkli kelimelerdir

        // bu durumda String methodlarinidan yardim aliriz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String gunIsmi = scan.next().toLowerCase(); // kullanici nasil yazarsa yazdin biz kucuk harfe ceviririz

        // String ifadelerde == kullanilmasi tavsiye edilmez
        // cunku bekledigimizden farkli sonuc verecektir
        if(gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("girdiginiz gun haftasonu");
        }

        if(gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")) {
            System.out.println("girdiginiz gun hafta ici");
        }



    }
}
