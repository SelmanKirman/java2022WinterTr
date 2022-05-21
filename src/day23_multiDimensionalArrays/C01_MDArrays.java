package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {

        int arr[][] = {{3, 1, 7}, {6, 10, 2}};

        System.out.println(arr[0][2]);// 7
        System.out.println(arr[1][1]);// 10

        // ilk inner arrayin tum elementlerini yazdirin

        System.out.println(arr[0]); // arr[0]} bir arrayi oldugundan direkt yazdirilamaz

        System.out.println(Arrays.toString(arr[0])); // [3, 1, 7]

        System.out.println(Arrays.toString(arr[0])+ Arrays.toString(arr[1])); // [3, 1, 7][6, 10, 2]

        System.out.println(Arrays.toString(arr)); // [[I@b4c966a, [I@2f4d3709]

        // MDArray'de tum elementleri bir array olarak yazdirmak istersek

        System.out.println(Arrays.deepToString(arr)); // [[3, 1, 7], [6, 10, 2]]

    }
}
