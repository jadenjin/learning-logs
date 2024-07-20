package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test5 {
    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<>();
        hm.put("1", "1");
        hm.put("2", "2");
        hm.put("3", "3");
        hm.put("4", "4");
        hm.put("5", "5");
        hm.put("6", "6");
        hm.put("7", "7");
        hm.put("8", "8");
        hm.put("9", "9");
        hm.put("10", "10");
        hm.put("11", "11");

//        Set<Map.Entry<String, String>> entries = hm.entrySet();
//        Map.Entry[] array = entries.toArray(new Map.Entry[0]);
//        Map.Entry[] array2 = entries.toArray(array);
//        Map map = Map.ofEntries(array2);
//        System.out.println(map);

        Map<Object, Object> objectObjectMap = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));

    }
}
