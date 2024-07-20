package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {

        //addAll 批量添加元素

        ArrayList<String> list = new ArrayList<>();

        //2. 批量添加
        Collections.addAll(list,"abc","abc","abc","123");

        //3.打印
        System.out.println(list);

        //4.打乱
        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        int i = Collections.binarySearch(list, "abc");
        System.out.println(i);
    }
}
