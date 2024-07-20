package Test;

import java.util.*;

public class test4 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map=new HashMap<>();
        ArrayList<String> city1=new ArrayList<>();
        ArrayList<String> city2=new ArrayList<>();
        ArrayList<String> city3=new ArrayList<>();
        Collections.addAll(city1,"南京市","苏州市","淮安市区");
        map.put("江苏省",city1);
        Set<Map.Entry<String, ArrayList<String>>> entries = map.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            //entry表示每一个键值对对象
            ArrayList<String> value = entry.getValue();
            StringJoiner sj=new StringJoiner(", ","","");
            for (int i = 0; i < value.size(); i++) {
                sj.add(value.get(i));
            }
            System.out.println(entry.getKey() + " = " + sj);
        }
    }
}
