package day50_maps;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John",12345);
        empIds.put("Carl",54321);
        empIds.put("Jerry",8675309);

        System.out.println(empIds);

        System.out.println(empIds.get("Carl"));

        System.out.println(empIds.containsKey("Jerry"));
        System.out.println(empIds.containsKey("George"));
        System.out.println(empIds.containsValue(8675309));

        empIds.put("John", 98765);
        System.out.println(empIds);

        empIds.replace("Kramer",777);
        System.out.println(empIds);

        empIds.putIfAbsent("John",222);
        System.out.println(empIds);

        empIds.putIfAbsent("Steve",222);
        System.out.println(empIds);

        empIds.remove("Steve");
    }
}
