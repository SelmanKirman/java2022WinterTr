package day33_varargs_stringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="Veli";
        String str3="Oguzhan";
        String str4="Sametli";

        // Yazilan argument sayisi sabitse herzamanki gibi bir method olusturabiliriz
        // ancak argument sayisinin degisme ihtimali varsa
        // o zaman varargs tercih edilir
        enUzunKelime(str4,str2,str1,str3);


    }

    private static void enUzunKelime(String... str) {
        String enUzunStr="";

        for (String each: str
             ) {
            if (each.length()>enUzunStr.length()) {
                enUzunStr=each;
            }

        }

        System.out.println(enUzunStr);
    }
}
