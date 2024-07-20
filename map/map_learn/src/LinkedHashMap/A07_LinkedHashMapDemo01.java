package LinkedHashMap;

import java.util.LinkedHashMap;

public class A07_LinkedHashMapDemo01 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "a");
        map.put(3, "c");
        map.put(2, "b");
        map.put(4, "d");

        System.out.println(map);
    }
}
