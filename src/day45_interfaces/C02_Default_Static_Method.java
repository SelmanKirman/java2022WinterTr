package day45_interfaces;

public class C02_Default_Static_Method implements I01_Default_Static {

    /*
    Bir interfacede default veya static olarak tanimlanan ve bodysi olan
    methodlarin override edilmesi mecburi DEGILDIR
    Eger static olarak tanimlanmissa zaten override edemeyiz
     */
    @Override
    public void method1() {
        System.out.println("child class method1");
    }

    /*
    Parent Interfacedeki default olarak tanimlanan method'u
    istersek override ederiz istersek etmeyiz
    override etmezsek, method cagrildiginda Parent Interface'de calisir
    override edersek, child classdaki overriding method calisir.

    @Override
    public void method2() {
        System.out.println("child class method2");
    }
    */

    public static void main(String[] args) {

        // Interface'de static olarak tanimlanan methodlara
        // static yontemlerle ulasilabilir InterfacedeIsmi.methodIsmi
        //
        I01_Default_Static.method3();

        C02_Default_Static_Method obj = new C02_Default_Static_Method();
        obj.method1(); // Child Class
        obj.method2(); // Parent Interface
        // obj.method3(); eski classlarda static bir uyeye
        // static olmayan yollarla da ulasabilirdik
        // ancak interface icerisinde static olarak tanimlanan methoda
        // static olmayan yontemlerle ulasilamaz


    }
}

