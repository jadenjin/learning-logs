package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A03_MapDemo3 {
    public static void main(String[] args) {
        //Map的第二种遍历方式

        //1.创建Map集合的对象
        Map<String,String> map = new HashMap<>();

        //2.添加元素
        map.put("尹志平", "小龙女");
        map.put("郭靖", "穆念慈");
        map.put("欧阳克", "黄蓉");

        //3.第二种遍历
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":"+entry.getValue());
        }

        entries.iterator().forEachRemaining(System.out::println);

        entries.forEach(System.out::println);

    }
}
