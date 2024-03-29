package day49_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzenliYazdirma {
    public static void main(String[] args) {
        // Sinif listesini duzenli bir sekilde yazdirmak
        Map<Integer,String> sinif = MapOlustur.myMap();
        System.out.println(sinif);
        sinifListYazdir(sinif);
    }

    private static void sinifListYazdir(Map<Integer, String> sinif) {

        System.out.println("Numara Isim Soyisim Brans");
        System.out.println("=========================");

        // Map yapisindan yazdirdigimizda kullanicilar bir sey anlamayabilir
        // bunun icin once map yapisini kodlarla manipule edip
        // map'deki datalari , istedigimiz formata sokmamiz gerekir
        // 1. adim key ve valuelari map'demn alip
        // iki farkli collection uyesine atadik
        Set<Integer> keySet=sinif.keySet();
        Collection<String> valueSet= sinif.values();

        System.out.println(keySet);
        System.out.println(valueSet);
        System.out.println(valueSet.size());
        for (String each: valueSet
             ) {
            System.out.println(each);
        }
    }
}
