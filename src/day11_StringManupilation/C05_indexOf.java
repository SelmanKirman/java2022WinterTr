package day11_StringManupilation;

import java.util.Scanner;

public class C05_indexOf {
    public static void main(String[] args) {

        String str1 = "Java bir baska guzel valla cok guzel";
        // istersek char olarak verdigimiz bir harfin indexini bize dondurur
        System.out.println(str1.indexOf('3'));

        // istersek bir harf ya da metin olarak verdigimiz Stringin indexini dondurur


        System.out.println(str1.indexOf("l")); // 19
        System.out.println(str1.length()-1); // 19
        System.out.println(str1.indexOf("aska")); // 10

        // ayni harften birden fayla varsa ?
        System.out.println(str1.indexOf("b"));// 5

        //

        System.out.println(str1.indexOf('b',5));
        // bu methodda java aramaya fromIndex olarak verdigimiz indexden baslar


        // verilen Stringdeki 2.a harfinin indexini bulalim
        int ilkIndex = str1.indexOf('a'); // 1
        System.out.println(str1.indexOf('a',ilkIndex+1)); // 3

        // verilen Stringdeki 2.b harfinin indexini bulalim
        int ilkbindex = str1.indexOf("b");
        System.out.println(str1.indexOf("b",ilkbindex+1)); // 3

        // 20. indexten sonra guzel aratalim
        System.out.println(str1.indexOf("guzel",20)); // 31


        // String'de olmayan bir harf aratsak

        System.out.println(str1.indexOf("y")); // y yok demesi layim ama return type i index
        // yok demenin sayisal karsiligi olarak hjava -1 dondurmeyi tercih etmistir

        // kullanicidan mail adresini isteyin @ isaretini icermiyorsa gecersiz yazdirin
        // iceriyorsa mailiniz kabul edilmistir yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mailinizi yazin");
        String mail = scan.next();

        if(mail.indexOf("@")==(-1)) {
            System.out.println("Gecersiz");
        } else {
            System.out.println("mailiniz kabul edildi");
        }

        // Ozet : indexOf methodu icerisine yazilan String veya Charin
        // metinde hangi indeyde oldugunu bize dondurur
        // eger aradiginiz metin veya char yoksa, olmadiginin delili olarak
        // bize -1 dondurur

    }
}
