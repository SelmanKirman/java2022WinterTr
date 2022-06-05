package day36_inheritance;

public class Child extends Parent{

    Child() {
        super();
        System.out.println("Child Cons. calisti");
    }

    // Tum classlarda biz gormesek bile
    // Javanin olusturdugu default cons vardir

    // Extends keyword kullanan classlardaki
    // Tum Conslarin ilk satirinda
    // biz gormesek bile super()
    // constructor call vardir.
    // yani parent classin parametresiz cons call

    public static void main(String[] args) {

        Child child = new Child();

    }
}
