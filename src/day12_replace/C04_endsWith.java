package day12_replace;

public class C04_endsWith {
    public static void main(String[] args) {
        // Kullanicidan email adresini girmesini isteyin
        // mail @gmail icermiyorsa "lutfen gmail adresi giriniz
        // @gmail.com ile bitiyorsa "Email adresiniz kaydedildi" ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontrol edin " yazdirin
        // mehmet@gmail.com.tr
        String email= "mulkiyeayboy@hotmmail.com";
        String arananMetin= "@gmail.com";

        if(!email.contains(arananMetin)) {
            System.out.println("Lutfen gmail adresi giriniz");
        }else if(email.endsWith(arananMetin)) {
            System.out.println("Email adresiniz kaydedildi");
        } else {
            System.out.println("Lutfen yazimi kontrol edin");
        }

    }
}
