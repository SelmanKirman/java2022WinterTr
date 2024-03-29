package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_iterator {

    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        System.out.println(liste); // [5, 7, 8, 6, 9]


        Iterator itr = liste.iterator(); // iterator methodunu olusturdugumuz liste objesi
        // uzerinden ArrayList classindan calistiriyoruz

        /*
        iterator nasil calisir
        bir iterator objesi olusturmak icin collection uyesi bir obje kullanmaliyiz
        Iterator itr = liste.iterator();
        yani biz bu iterator objesini bizim ornegimizde liste objesi uzerinde
        calistirmak icin olusturmus olduk
        Biz iterator objesini olusturdugumuzda
        Iterator collection'in ilk elementinin oncesine gidip bekler


        [ (itr)5, 7, 8, 6, 9]

        itr.hasNext()) ===> true iterator'a yaninda eleman var mi diye sorar, true veya false dondurur

        itr.next(); ==> iterator bor sonraki elementin yanina gecer
        ve uzerinden gectigi elementi bize dondurur
         [ 5, (itr)7, 8, 6, 9] ===> bize 5 dondurur

         itr.next(); ==>

          [ 5, 7, (itr)8, 6, 9] ===> bize 7 dondurur

          itr.remove(); // iterator'in elinde olan elementi sildi
          dolayisiyla ust uste iki kere itr.remove(); KULLANILAMAZ

          once itr.next(); methodunu calistirip
          iterator'in bir element olmasini saglamaliyiz

         */

        System.out.println(itr.hasNext()); // true

        System.out.println(itr.next()); // 5
        System.out.println(itr.next()); // 7
        System.out.println(itr.next()); // 8
        itr.remove();
        System.out.println(liste); // [5, 7, 6, 9]

        /// itr.remove();
    }
}
