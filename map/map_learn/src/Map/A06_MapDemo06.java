package Map;

import java.util.*;

public class A06_MapDemo06 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        String[] arr = {"A","B","C","D"};
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
//            System.out.println(arr[index]);
            list.add(arr[index]);
        }

        for(String name :list){
            if(map.containsKey(name)){
                map.compute(name, (k, count) -> count + 1);
            }else {
                map.put(name, 1);
            }
        }
        System.out.println(map);


        //求最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue() > max){
                max = entry.getValue();
            }
        }

        //4. 判断是否有两个一样的
        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue() == max){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
