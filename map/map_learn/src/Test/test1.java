package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<>();
        Collections.addAll(list,"赵六","张三","李四","王五");
        Random r = new Random();
        int i = r.nextInt(list.size());
        System.out.println(list.get(i));


        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
