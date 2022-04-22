package day11_StringManupilation;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        // kullaniciya derse katilip katilmak istemedigini sorun
        // evet derse, cevabini ve "derse katiliminiz alinmistir" yazdirin
        // hayir derse cevabinizi ve "Sonraki derslerimize bekleriz" yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("Derse katilmak istermisiniy ? \nEvet veya Hayir yaziniz");
        String cevap= scan.next();

        if(cevap.equalsIgnoreCase("evet")) {
            System.out.println("cevabiniz : " + cevap + "\nderse katiliminiz onaylanmistir");
        } else if (cevap.equalsIgnoreCase("hayir")) {
            System.out.println("cevabiniz : " + cevap + "\nSonraki derslerimize bekleriz");
        } else {
            System.out.println("Lutfen evet veya hayir yaziniz");
        }
    }
}
