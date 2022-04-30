package day20_scope_Arrays;

public class C01_InstanceVariables {

    int sayi;
    String bransIsmi="Java";
    boolean okulAcikMi;

    public static void main(String[] args) {

        // sayi=10; sayi variable i static olmadigi icin main methoddan direkt kullaniliamaz
        // instance variable lara static methodlardan ulasabilmek icin obje olusturmaniz gerekir

        C01_InstanceVariables obj1 = new C01_InstanceVariables();
        System.out.println(obj1.sayi); // 0
        obj1.sayi=10;
        System.out.println(obj1.sayi); // 10
        obj1.bransIsmi = "SQL";
        System.out.println(obj1.okulAcikMi); // false

        C01_InstanceVariables obj2 = new C01_InstanceVariables();
        System.out.println(obj2.sayi); // 0
        System.out.println(obj2.bransIsmi); // Java

        obj1.okulAcikMi=true;
        System.out.println(obj2.okulAcikMi);
    }
}
