package day52_linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> nameLinkedList = new LinkedList<>();
        nameLinkedList.add("John");
        nameLinkedList.add("Paul");
        nameLinkedList.add("George");
        nameLinkedList.add("Ringo");
        System.out.println(nameLinkedList.get(2));
        nameLinkedList.add(1, "Jerry");
        System.out.println(nameLinkedList);

        String[] names = new String[4];
        ArrayList<String> nameArrayList = new ArrayList<>();
        nameArrayList.add("John");
        nameArrayList.add("Paul");
        nameArrayList.add("George");
        nameArrayList.add("Ringo");
        System.out.println(nameArrayList.get(2));
        nameArrayList.add(1, "Jerry");

    }
}
