package day10_switch_StringManupilation;

import java.util.Scanner;

public class C01_SwitchCase {

    public static void main(String[] args) {


        // kullanicidan sayi olarak kacinci ay oldugunu alip
        // istenen ay ismini yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz");
        int ayNo=scan.nextInt();

        // bu soruyu if else ile yapabiliriz ama art arda 12 if else
        // cok kalabalik ve anlasilmasi guc olabilir
        // bunun yerine switch-case yapisini kullanabiliriz

        switch (ayNo) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasim");
                break;
            case 12:
                System.out.println("Aralik");
                break;

            default:
                System.out.println("Lutfen 1 ile 12 arasinda bir sayi giriniz");
        }
        // switch icine yazilan variable'in degerine gore
        // ilgili case'i bulur ve break buluana kadar kodu calistirit
        // eger brake yoksa ilgili case den asagi dogru tüm caseler calisir
        // if else deki son else gibi geriye kalan tum durumlarin tamamen
        // kapsayacak bir satir daha ekleyebiliriz

    }
}