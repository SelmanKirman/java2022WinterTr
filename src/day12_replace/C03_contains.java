package day12_replace;

public class C03_contains {
    public static void main(String[] args) {
        // Kullanicidan email adresini girmesini isteyin
        // mail @gmail icermiyorsa "lutfen gmail adresi giriniz
        // @gmail.com ile bitiyorsa "Email adresiniz kaydedildi" ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontrol edin " yazdirin
        // mehmet@gmail.com.tr

        String email= "mulkiyeayboy@hotmmail.com";
        String arananMetin= "@gmail.com";

        if (!email.contains(arananMetin)) {
            System.out.println("Lutfen gmail adresi giriniz");
        } else if (email.lastIndexOf(arananMetin)==(email.length()-10)) {
            System.out.println("Email adresiniz kaydedilde");
        } else {
            System.out.println("Lutfen yazimi kontrol edin");
        }

    }
}
