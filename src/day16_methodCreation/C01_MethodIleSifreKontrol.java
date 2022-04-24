package day16_methodCreation;

public class C01_MethodIleSifreKontrol {
    public static void main(String[] args) {
        // Soru 6) Kullanicidan bir sifre girmesini isteyin
        // Asagidaki sartlari sagliyorsa "Sifre basari ile tanimlandi",
        // sartlari saglamazsa "Isim basarisiz, Lutfen yeni bir sifre girin" yazdirin
        // -Ilk harf buyuk harf olmali
        // -Son harf kucuk harf olmali
        // -Sifre bosluk icermemeli
        // -Sifre uzunlugu en az 8 karakter olmali
        // bu 4 kontrolu method ile yapin

        String sifre="Abc123abn";

        boolean ilkHarfKontrol=ilkHarfKontrolet(sifre);
        boolean sonHarfKontrol=sonHarfKontrilEt(sifre);
        boolean boslukKontrol=boslukKontrolEt(sifre);
        boolean uzunlukKontrol=uzunlukKontrolEt(sifre);
        boolean sonuc=sonucGoster(ilkHarfKontrol,sonHarfKontrol,boslukKontrol,uzunlukKontrol);


    }

    private static boolean sonucGoster(boolean ilkHarfKontrol, boolean sonHarfKontrol, boolean boslukKontrol, boolean uzunlukKontrol) {
        boolean sonuc=false;
        if(ilkHarfKontrol && sonHarfKontrol && boslukKontrol && uzunlukKontrol) {
            sonuc=true;
            System.out.println("Sifre basari ile tanimlandi");
        } else {
            sonuc=false;
            System.out.println("Islem basarisiz, Lutfen yeni bir sifre girin");
        }
        return sonuc;
    }

    private static boolean uzunlukKontrolEt(String sifre) {
        boolean uzunlukKontrolSonuc = false;
        if (sifre.length()>=8) {
            uzunlukKontrolSonuc =true;
        } else {
            System.out.println("Sifre en az 8 karakter olmali");
            uzunlukKontrolSonuc = false;
        }
        return uzunlukKontrolSonuc;
    }

    private static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonuc=false;
        if (!sifre.contains(" ")) {
            boslukKontrolSonuc=true;

        } else {
            System.out.println("sifre bosluk icermemeli");
            boslukKontrolSonuc=false;
        }

        return boslukKontrolSonuc;
    }

    private static boolean sonHarfKontrilEt(String sifre) {
        boolean sonHarfSonuc=false;
        char sonHarf=sifre.charAt(sifre.length()-1);
        if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
            sonHarfSonuc = true;
        } else {
            System.out.println("Sifrenizin son harfi kucuk harf olmali");
        }

        return sonHarfSonuc;
    }

    private static boolean ilkHarfKontrolet(String sifre) {
        char ilkHarf = sifre.charAt(0);
        boolean ilkHarfSonuc=false;

        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            ilkHarfSonuc = true;
        } else {
            System.out.println("Sifrenizin ilk harfi buyuk harf olmali");
            // ilkHarfSonuc = false;
        }

        return ilkHarfSonuc;
    }
}
