package day40_overriding_polymorphism;

public class C02 extends C01{

    private void method4(){
        System.out.println("Parent method4");
        // Parent classdaki private method 4 e
        // Child classdan ulasmamiz mumkun olmadigindan
        // Java bu iki methodu
        // tamamen FARKLI iki Method Olarak Kabul Eder
        // @Override kullanmak istersek Java kabul etmez CTE verir.
    }


    @Override
    protected String method3(){ // covariant return type
    // Covariant icin yazildi
        return "Java";
    }

    @Override
    public void method2() {
        System.out.println("Child method2");
        /*
        @Override notasyonu overidden method ile overriding methodu
        birbirine baglar
        Farkinda olmadan overridden method silinirse veya signature degistirilirse
        bu iliski bozulacagi icin Java CTE verir

        Notasyon kullanilmazsa Java bunlari iliskisini bilir ama
        overridden method silinirse sesini cikarmaz
         */
    }

    public static void main(String[] args) {

        C02 obj = new C02();

        obj.method1(); // parent method1
        obj.method2(); // child method2

        System.out.println("************************");
        C01 obj2  = new C02();
        obj2.method1(); // parent method1
        obj2.method2(); // child method2

        System.out.println("************************");
        C01 obj3 = new C01();
        obj3.method1(); // parent method1
        obj3.method2(); // parent method2



    }
}
