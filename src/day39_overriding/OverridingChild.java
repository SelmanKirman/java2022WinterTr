package day39_overriding;

public class OverridingChild extends OverridingParent{

    public void method1(){
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {

        /*
        Bir onje olusturulurken data turu ve cons ayni classdan secilmisse
        Java direkt o class a gider
        hem variable hem de method icin o class da varsa kullanir, yoksa i classin
        parentlarina bakar
         */
        OverridingChild obj1 = new OverridingChild();
        obj1.method1();//Child class method1
        obj1.method2();//Parent class method2


        OverridingParent obj3 = new OverridingParent();

        obj3.method1();//Parent class method1
        obj3.method2();//Parent class method2

        /*
        Eger Data turu parent , cons child classdan secildiyse
        variablelarda yukaridaki sekilde calismaya devam eder
        Ancak
        Methodlar icin Data turunun oldugu classdaki method
        Child class tarafindan Override edilmis mi diye kontrol etmemiz gerekir
        Eger child class'larda bumethod override edilmisse
        override eden method calisir
         */

        OverridingParent obj2 = new OverridingChild();

        obj2.method1();//Child class method1
        obj2.method2();//Parent class method2


    }


}
