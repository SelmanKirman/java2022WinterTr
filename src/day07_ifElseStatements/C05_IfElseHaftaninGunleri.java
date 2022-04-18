package day07_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {
    public static void main(String[] args) {

        //Kullanicidan gun ismini alin ve hafta ici veya haftasonu oldugunu yazdir


        //String case sensitivedir
        // yani pazar , PAZAR , Pazar farkli kelimelerdir

        // bu durumda String methodlarinidan yardim aliriz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String gunIsmi = scan.next().toUpperCase();

        if(gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESI")) {
            System.out.println("girdiginiz gun haftasonu");
        } else {
            System.out.println("girdiginiz gun hafta ici");
        }

    }
}
