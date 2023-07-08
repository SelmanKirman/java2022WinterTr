package day43_garbage_abstractClass;

public class C02_Final extends C01_Final{



    public static void main(String[] args) {

        System.out.println(C01_Final.okulIsmi);

        // C01_Final.okulIsmi="Hasan Koleji";
    }

    /*
    public static  void method1(){

        Override parent classdaki methodu child a uyarlamak demekti
        yani islevini degistirmek istiyoruz
        ancak parent classdaki method final olarak tanimlandigindan
        Java methodun uyarlanmasina izin vermiyor

        System.out.println("Parent class final method");
    }
    */

}
