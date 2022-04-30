package day21_arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        // arrayi nasil deklare ederiz
        // data turu, arrayin ismi ve koseli parantez yazarak array deklare edilir
        int arr1[] = {1,3,5};
        int[]arr2 = {2,3,5};
        int [] arr3 = {1,4,5};

        double arr4[]= {10.2,20.1,5};

        String arr5[]= {"Ali","Veli","Ayse"};

        // assign mecburi midir ?
        int sayi;

        int arr6[];

        // Kullanmadan once mutlaka deger atamasi yapmamiz gerekir

        // hem deklare edip hem de atama yapacaksam nasil yapabilirim ?
        // 1- deklare edip esitligin sagina süslü parantez icerisinde degerleri yazabilirim
        String arr7[]= {"Ali","Veli","Ayse"};
        // 2- icine deger atamadan olusturmak isterseniz, boyutunu belirlememiz gerekir

        int arr8[]= new int[5]; // java icinde 5 tane default deger olan bir array olusturur
                                // [0,0,0,0,0]

    }
}
