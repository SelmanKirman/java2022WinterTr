package day15_methodCreation;

public class C09_MethodCreation {
    public static void main(String[] args) {
        String isim="Yasemin yalcin";
        String soyisim="Sari";
        String kKNo="1234567890123456";

        String gizlenmisIsimSoyisim= isimSoyisimGizle(isim,soyisim); // isim ve soyisim argumanlarini alip methoda gitti
        krediKartiGizle(kKNo);


        // eger bir methoddan bir islem yapmasini
        // ve yaptigi islemi bize getirmesini isterseniz
        // return type void degil, bize getirecegi sonucun data turunde olmalidir
        isimSoyisimGizle(isim,soyisim);
        // bana isim ve soyisim gizlenmis halini getirmesini istiyorum
        // bekledigim donus String olur

        System.out.println(gizlenmisIsimSoyisim);

        String gizlenmisKKNo=krediKartiGizle(kKNo);

        System.out.println(gizlenmisKKNo);






    }

    private static String krediKartiGizle(String kKNo) {
        String yeniKKNo="**** **** **** " + kKNo.substring(12);
        return yeniKKNo;
    }

    private static String isimSoyisimGizle(String isim, String soyisim) {
        String yeniIsim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim = soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");
        // method olusturmada 3.adim
        // method calisinda sadece birsey mi yazdiracak
        // yoksa bize bir data mi dondurecek buna kadar vermektir
        // Bu soruda gizlenmis isim soyisim dondurmesi istendiginden
        // return Type'i void degil String sectik
        // ve methodun sonuna return edilecek datayi yazdik
        return yeniIsim + " " + yeniSoyisim;
    }
}
