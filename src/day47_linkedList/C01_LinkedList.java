package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        // LinkedList'in 2 tane parent Interface i vardir
        // LinkedList olustururken data turu olarak;
        // LinkedList secersek : iki parent'daki tum methodlar kullanilabilir
        // List secersek : sadece List Interface'indeki methodlar
        // Deque/Queue secersek : Deque'deki methodlari kullanabiliriz

        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(10); // Linkedlist methodunu calistirir



        // Sadece List interface'inden ozellikler kullanmak istersek
        List<Integer> ll2 = new LinkedList<>();
        ll2.add(10);
        ll2.remove( 0);

        // Sadece Deque den gelen ozellikleri kullanmka istersek

        Deque<Integer> ll3 = new LinkedList<>();
        ll3.addLast(20);
        ll3.addFirst(15);

    }
}
