package day35_inheritance;

public class Isci extends Personal{
    public static void main(String[] args) {

        Personal objPers = new Personal();
        objPers.isim="Eren";
        objPers.soyisim="Terzioglu";
        objPers.adres="Amsterdam";

        Isci objIsci=new Isci();
        objIsci.isim="Huseyin";
        objIsci.soyisim="Efe";
        objIsci.adres="Ankara";

    }
}
