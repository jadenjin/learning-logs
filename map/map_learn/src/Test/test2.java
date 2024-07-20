package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test2 {
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        Collections.shuffle(list);
        Random r = new Random();
        int i = r.nextInt(list.size());
        int number = list.get(i);

        //创建集合存储男生女生姓名
        ArrayList<String> boys = new ArrayList<>();
        ArrayList<String> girls = new ArrayList<>();
        Collections.addAll(boys,"男1","男2","男3");
        Collections.addAll(girls,"女1","女2");

        if (number==0) {
            System.out.println(boys.get(r.nextInt(boys.size())));
        }else {
            System.out.println(girls.get(r.nextInt(girls.size())));
        }
    }
}
