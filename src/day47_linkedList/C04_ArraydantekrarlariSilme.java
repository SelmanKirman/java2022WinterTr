package day47_linkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class C04_ArraydantekrarlariSilme {
    public static void main(String[] args) {

        // verilen bir array'dan tekrar eden elementleri silip
        // unique elementler olusan bir array halina donduren bir method yazin

        int arr[] = {3,4,5,6,3,1,2,7,8,6,1,4,2,8};


        arr = benzersizYap(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] benzersizYap(int[] arr) {
        Set<Integer> benzersizSet = new TreeSet<>();
        for (Integer each: arr
             ) {
            benzersizSet.add(each);
        }

        System.out.println(benzersizSet);
        // Set'de index yapisi yoktur, dolayisiyla forLoop kullanamayiz
        Integer arrBenzersiz[]=new Integer[benzersizSet.size()];
        int index = 0;
        for (Integer each:benzersizSet) {
            arr[index]=each;
            index++;
        }
        return arr;
    }
}
