package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {

    public static void main(String[] args) {
        // siniftaki ogrenci listesini duzenli olarak yazdirin

        Map<Integer,String> sinifListMap= MapOlustur.myMap();
        System.out.println(sinifListMap);

        /*
        Eger keylere tek tek ulasmak istersek
        index yapisina ihtiyacimiz var
        ancak map index yapisini desteklemez
        bunun icin keyleri once bir sete
        sonra da setin tum elementlerini bir list'e ekledik
         */

        Set<Integer> sinifKeySeti = sinifListMap.keySet();
        // Integer keyArr[] = new Integer[sinifKeySeti.size()];
        List<Integer> keyList = new ArrayList<>();
        /* for (Integer each: sinifKeySeti
             ) {
            keyList.add(each);
        }
        */
        keyList.addAll(sinifKeySeti);

        // Simdi de valueleri index ile ulasabilecegimiz bir sekle sokalim

        Collection<String> sinifValueColl =sinifListMap.values();
        System.out.println(sinifValueColl);

        List<String> sinifValueList = new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);

        System.out.println(sinifValueList);

        // her bir value birden fazal bilgiyi iceriyor
        // onun icin valueleri MD bir arraye atmak mantikli duruyor
        // ancak MDA olusturmak icin boyutlari bilmeye ihtiyac var


        int outerArrayBoyut = sinifValueList.size();
        System.out.println(outerArrayBoyut);

        // innder arraylerin boyutunu bulmak biraz daha kompleks olacak

        String ilkValue=sinifValueList.get(0);
        System.out.println(ilkValue);
        String ilkValueArray[]=ilkValue.split(", ");
        int innerArrayBoyut=ilkValueArray.length;
        System.out.println(innerArrayBoyut);


        String valueMDArr[][]= new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp[]=sinifValueList.get(i).split(", ");
            for (int j = 0; j < innerArrayBoyut; j++) {

                valueMDArr[i][j]=temp[j];
            }

        }

        // bu satira kadar keyleri index ile ulasabildigim keyList'e atadim
        // value'leri valueMDArr'e atadim
        // simdi bu key ve valueleri istedigim gibi manipule edebilirim

        System.out.println("Numara Isim Soyisim Brans");
        System.out.println("=========================");
        for (int i = 0; i < keyList.size(); i++) {
            System.out.print( keyList.get(i)+ "   " );
            for (int j = 0; j < innerArrayBoyut ; j++) {
                System.out.print(valueMDArr[i][j] + "  ");
            }

            System.out.println("");
        }



    }
}
