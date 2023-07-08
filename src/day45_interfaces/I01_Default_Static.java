package day45_interfaces;

public interface I01_Default_Static {

    /*
    Interfacelerde sadece abstract methodlar bulunur
    bodysi olan concrete bir method olusturmak istedigimizde
    Java CTE verir

    Ancak Java8 ve uzeri versiyonlarda, istisnai olarak
    static veya default olarak tanimlanan methodlarin bodysi olabilir
    ancak burada kullanilan default keywordu access modifier degildir.
    Cunku Interfacelerde tum methodlar public ve abstract'ti.

    asagidaki ornekte gorulecegi gibi default olarak tanimlanmis
    bir methoda access modifier olarak public yazabilirsiniz
    ( access modifier yazmasak da Java methodu public olarak kabul edecektir )
     */


    void method1();

    public default void method2(){
        System.out.println("Interfacedeki default method");
    }

    static void method3(){
        System.out.println("Interfacedeki static method");

    }
}
