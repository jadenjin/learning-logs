package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test3 {
    public static void main(String[] args) {

        ArrayList<String> list  = new ArrayList<>();
        ArrayList<String> list2  = new ArrayList<>();
        Collections.addAll(list,"赵六","张三","李四","王五");
        Collections.copy(list,list);
        Random r = new Random();
        int i = r.nextInt(list.size());
        System.out.println(list.get(i));
        list.remove(i);
    }
}
