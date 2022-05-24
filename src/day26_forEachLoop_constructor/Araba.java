package day26_forEachLoop_constructor;

public class Araba {
    /* Javada her Class olusturdugumuzda
       Java o class'dan ileride objeler uretmek gerekecegini bilir
       ve biz ozellikle belirtmesek de Java
       her olusturdugu class'a bir constructor koyar

       Javanin class olustururken class a koydugu constructor'a
       DEFAULT CONSTRUCTOR denir ve bu constructor gorunmez

       Eger biz gorunut bir constructorimiz olsun istersek
       default constructor ile ayni gorevi yapan bir constructor olusturabiliriz
       veya istersek ayni kaliptan farkli desenlerde objeler olusturmak icin
       farkli ozelliklerde constructorlar da olusturabiliriz

       Constructor lar birbirinden farklilastiran tek ayticalik
       kullanilan parametre sayisi ve parametre data turudur

     */

    public Araba() {
        System.out.println("parametresiz constructor calisti");
    }
    // bir kod blogunun method veye constructor olmasindan emin olmak istiyorsaniz
    // iki seye dikkar etmelisiniz
    // 1- Constructorlarin ismi class ismi ile ayni olmak yorundadir yani buyuk harfle baslar
    // 2- Constructorlarin return type'i olmaz

    // ozetle: Constructorlarin adi class adi ile ayni olmak zorundadir
    //         ve return tpye i olmamalidir

    public Araba(String renk){
        System.out.println(renk + " renkli bir araba üretildi");
    }


    public Araba(int yil){
        System.out.println(yil + " model bir araba uretildi");
    }


    public Araba(int yil,String renk) {
        System.out.println(yil + " model " + renk + " renginde bir araba olusturuldu");
    }
}
