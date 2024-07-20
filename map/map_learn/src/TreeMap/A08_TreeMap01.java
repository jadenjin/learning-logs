package TreeMap;

import java.util.TreeMap;

public class A08_TreeMap01 {
    public static void main(String[] args) {
        // 1.创建集合对象
        TreeMap<Integer,String> treeMap = new TreeMap<>((o1, o2) -> o2 - o1);

        treeMap.put(5,"可口可乐");

        treeMap.put(1,"奥利奥");
        treeMap.put(3,"六个核桃");
        treeMap.put(4,"小当家");
        treeMap.put(2,"康师傅");


        //3. 遍历
        System.out.println(treeMap);

    }
}
