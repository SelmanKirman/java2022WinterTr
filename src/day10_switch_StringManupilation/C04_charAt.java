package day10_switch_StringManupilation;

import java.util.Locale;

public class C04_charAt {
    public static void main(String[] args) {

        // Stringde herhangi bir karakteri almak istedigimizde
        // o harfin index ini kullanarak
        // str.charAt(isteneneIndex) yazabiliriz

        String str = "Java Cok Guzel";

        // J yi yazdiralim

        System.out.println(str.charAt(0));


        // G yi yazdiralim

        System.out.println(str.charAt(9));

        // va yazdiralim

        System.out.println(""+str.charAt(2)+""+str.charAt(3));

        // cOK seklinde yazdiralim

        System.out.println(str.toLowerCase().charAt(5)+
                ""+str.toUpperCase().charAt(6)+
                str.toUpperCase().charAt(7));

        // son harfi yazdir
        // String de 14 harf var, son harfin indexi 14-1
        System.out.println(str.charAt(14-1)); // uzunluk-1

        // eger uzunlugu index olarak girersek

        System.out.println(str.charAt(14));
    }
}
