package day25_lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {

    public static void main(String[] args) {
        // verilen bir arrayi listeye cevirin

        String arr[]={"A","B","C"};
        List<String> arraydenList= Arrays.asList(arr);

        // arrayden liste cevirdigimiz zaman yeni listin uzunlugunu degistiremeyiz
        // dolayisiyla yeni list ile add(), remove(), clear() gibi methodlar calistirmak
        // istedigimizde Exception olusturur.

        // arraydenList.add("J"); // UnsupportedOperationException
        System.out.println("19.satirda list: " + arraydenList);

        arr[1] = "F";

        System.out.println("23.satirda Array: " + Arrays.toString(arr));
        System.out.println("24.satirda list " + arraydenList);

        arraydenList.set(0,"Y");

        System.out.println("28.satirda Array : " + Arrays.toString(arr));
        System.out.println("29.satirda List : " + arraydenList);

        List<String> list = new ArrayList<>();
        list.add("tavsan");
        list.add("horoz");
        System.out.println(list);//[tavsan,horoz]

        String arr1[]=list.toArray(new String[0]);
        System.out.println(Arrays.toString(arr1)); //[tavsan, horoz]

        Object arr2[] = list.toArray();
    }
}
