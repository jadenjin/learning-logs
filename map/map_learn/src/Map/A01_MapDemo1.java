package Map;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    public static void main(String[] args) {
        // 1.创建对象
        Map<String, String> map  = new HashMap<>();

        //2.添加元素
        //不存在就添加，存在就覆盖，返回被覆盖的值
        map.put("陈进","陈若凝");
        map.put("1", "2");
        String put = map.put("1", "3");

        //清空
        map.clear();

        //判断是否包含
        boolean b = map.containsKey("1");
        boolean b1 = map.containsValue(put);

        //3.打印
        System.out.println(map);
        System.out.println(put);
    }
}
