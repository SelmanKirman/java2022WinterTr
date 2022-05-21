package day22_arrays;

import java.util.Arrays;

public class C04_TerstenSiralayipKaydetme {
    public static void main(String[] args) {
        // verilen bir arrayi buyukten kucuge siralayip yazdiran bir method olusturun

        int arr[]={3,5,6,1,9,45,25,4,9};

        arr=terstenSirali(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("En buyuk elemen : " + arr[0]);
    }

    public static int[] terstenSirali(int[] arr) {

        Arrays.sort(arr); // [1, 3, 4, 5, 6, 9, 9, 25, 45]
        int tersArr[]=new int[arr.length]; // [0, 0, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length ; i++) {

            tersArr[i] = arr[arr.length-1-i] ;

        }

        return tersArr;

    }
}
