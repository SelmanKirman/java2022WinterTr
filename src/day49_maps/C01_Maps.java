package day49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {
        // Java da collection uyesi bir yapida
        // data turu Object secilirse her data turunden deger ekleyebiliriz
        // ancak bu durumda surekli casting problemleri ile karsilasiriz

        List<Object> list = new ArrayList<>();
        list.add("Ergin");
        list.add(15);
        list.add(10.2);

        System.out.println(list);
        list.set(1, (Integer)(list.get(1))+10);

        Map<Integer, String> sinifList = new HashMap<>();
        // bir sinifta ogrenci no ve isim , soyisim ve brans olarak map olusturmak istiyoruz
        // key tek bir unique degerdir
        // ama value/deger birden fayla bilginin birlesmesinden olusabilir
        // bu durumda daha sonra istedigimiz bilgilere dogru sekilde ulasabilmek icin
        // tum elementler icin value ayni bicimde olusturulmalidir
        // (versi siralamasi ve sekil acisindan)
        sinifList.put(101,"Ali, Can, Dev");
        sinifList.put(102,"Veli, Yan, QA");
        sinifList.put(103,"Ali, Yan, C#");

        System.out.println(sinifList);
        // {101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, C#}

        System.out.println(sinifList.keySet());

        System.out.println(sinifList.values());
        // [Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]



    }
}
