package day38_inheritance_overriding;

import java.util.ArrayList;
import java.util.List;

public class Ustabasi extends Isci{
    public String statu="Ustabasi";
    public String haklar="Ustabasi haftada birgün ekstra tatil hakkina sahip";


    public void mesai(){
        System.out.println("Ariza varsa Ustabasi ekstra ucret almadan calisir");
    }

    public void maasHesapla(){
        System.out.println("Ustabasi 30 gun * 8 saat * 12 euro = " + (30*8*12) + "Euro maas alir");
    }

    public static void main(String[] args) {
        /*
        Icinde oldugumuz Class'dan klasik haliyle bir obje olusturursak
        o obje ile cagirdigimiz variable ve methodlarda
        Java once icinde bulundugumuz class a bakar
        aradigimiz class uyesi icinde oldugumuz class da varsa
        bize onu getirir.
        Yoksa,
        parent class(lar)a bakar, ilk buldugunu getirir

         */
        Ustabasi yasin=new Ustabasi();
        System.out.println(yasin.statu);// Ustabasi
        System.out.println(yasin.haklar);// Ustabasi haftada birgün ekstra tatil hakkina sahip
        System.out.println(yasin.ikramiye);// Isciler yilda 1 ikramiye alir
        System.out.println(yasin.izin);// Tum personal yilda 4 hafta izin kullanabilir
        yasin.maasHesapla();
        yasin.mesai();

        /*
        Eger Isci olarak ozelliklerini gormek istersek
        Class adini ( Data Turu ) Isci seceriz
         */
        Isci ahmet=new Ustabasi();
        System.out.println(ahmet.statu); // Isci -----
        System.out.println(ahmet.haklar); // Isciler kidem tazminati alirlar
        System.out.println(ahmet.ikramiye); // Isciler yilda 1 ikramiye alir
        System.out.println(ahmet.izin); // Tum personal yilda 4 hafta izin kullanabilir
        ahmet.maasHesapla();
        ahmet.mesai();

        /*
        Siz bir objeyi hangi class'dan tanimlarsaniz o class'a ait ozelliklere sahip olur
         */
        Personal adem=new Ustabasi();
        System.out.println(adem.statu); // Isci -----
        System.out.println(adem.haklar); // Isciler kidem tazminati alirlar
        // System.out.println(adem.ikramiye); // CTE
        System.out.println(adem.izin); // Tum personal yilda 4 hafta izin kullanabilir
        adem.maasHesapla();
        adem.mesai();

        /*
        Personal adem=new Ustabasi(); bir ustabasi objesi
        Ustabasi 30 gun * 8 saat * 12 euro = 2880Euro maas alir
        Personal adem=new Personal(); bu Personal objesidir
        Ariza varsa Ustabasi ekstra ucret almadan calisir

         */

        /*
        Personal adem = new Ustabasi();

        adem'in data turu Personal'dir.
        boylece biz adem'i ne olarak isimlendirdigimizi bilebiliriz
        Ancak ben adem'in ustabasi oldugu biliyorum
        cunku cons i Ustabasi
        Ama bu yazim formati  ile
        adem'in tum Personal ile birlikte sahip oldugu
        ortak ozelliklerini vurgulamak istiyorum

        Bu kullanim seklinde olusturulan obje data turu olarak secilen class
        ve onun parent classlarindaki variablelari kullanabilir.



         */

        List<String> list= new ArrayList<>();

    }
}
