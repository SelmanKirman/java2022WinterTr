package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {
    // bir classi child class yaptigimizda
    // parent classdaki cons a ulasmasi gerekir
    // bu durumda parent classdaki cons in
    // A.M i uyhun bir modifier yapilmalidir

    Child() {
        super();
        System.out.println("child class parametresiz cons");
    }
    Child(int s){
        // Child class da tum conslarin ilk satirina
        // Java nin yerlestirdigi cons Parametresizdir yani super
        System.out.println("Child class parametreli cons.");
    }

    Child(int sayi1,int sayi2) {
        // Eger parent class'dan parametresiz cons i degil de
        // baska bir cons i calistirmak isterseniz
        // bunu child classdaki consin ilk satirina yazmalisiniz
        super(sayi1,sayi2);
        System.out.println("iki parametreli cons.");
    }

    public static void main(String[] args) {
        Child child = new Child(5,8);
    }


}
