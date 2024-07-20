package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        //Map遍历第一种方式

        //1.创建对象
        Map<String, String> map = new HashMap<>();

        //2.添加元素
        //不存在就添加，存在就覆盖，返回被覆盖的值
        map.put("尹志平", "小龙女");
        map.put("郭靖", "穆念慈");
        map.put("欧阳克", "黄蓉");

        //3. 通过键找值
        //3.1 获取所有键，把这些键放到一个集合里面
        Set<String> keys = map.keySet();

        //3.2 遍历单列集合，得到每一个键
//        for (String key : keys) {
////            System.out.println(key);
//            //3.3 获取值
//            String value = map.get(key);
//            System.out.println(key + ":" + value);
//
//        }

        //迭代器
        keys.iterator().forEachRemaining(System.out::println);
        //lambda表达式
        keys.forEach(s -> System.out.println(s));
    }

}
