package day27_constructor;

public class Cons02 {

    public static void main(String[] args) {

    Cons01 obj1 = new Cons01();// default constructor devrede
        // Con01 classinda hic constructor olusturmazsak
        // Java default constructori kullandigindan
        // obj1 i uretebiliriz

        // Ancak biz parametreli veya parametresiz bir constructor yazdigimizda
        // Java default constructori siler

        // Dolayisiyla biz herhangi bir constructor olusturdugumuzda
        // daha once baska classlar veya kullanicilarin
        // olusturmus oldabilecegi objeleri kullanabilmeleri icin
        // default constructorin islevini gerceklestirecek
        // parametresiz bir constructor olusturmakta fayda var

        Cons01 obj2 = new Cons01("Java");

    }
}
