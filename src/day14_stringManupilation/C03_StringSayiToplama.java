package day14_stringManupilation;

public class C03_StringSayiToplama {
    public static void main(String[] args) {
        // Soru 2) String seklinde verilen asagidaki fiyatlarin toplamini bulunuz
        // String str1=$13.99;
        // String str2=$10.55;

        String str1="$13.99";
        String str2="$10.55";

        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");

        System.out.println(str1+str2);

        double str1Sayi=Double.parseDouble(str1);
        double str2Sayi=Double.valueOf( str2);

        double sonuc=(str1Sayi+str2Sayi)/100;

        System.out.println("verilen String sayilarin toplami : $" + sonuc);
    }
}
