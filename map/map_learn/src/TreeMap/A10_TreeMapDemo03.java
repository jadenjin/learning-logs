package TreeMap;

import java.util.TreeMap;

public class A10_TreeMapDemo03 {
    public static void main(String[] args) {
        /**
         * 统计字符串 “aababcadabcde”
         * 按照以下格式输出
         * a (5) b (4) ...
         */

        TreeMap<String,Integer> map = new TreeMap<>();
        String s = "aababcadabcde";
        String[] ss = s.split("");
        for (String str : ss) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            }
            else {
                map.put(str, 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        map.forEach((s1, integer) -> sb.append(s1).append(" (").append(integer).append(") "));
        System.out.println(sb);
    }
}
