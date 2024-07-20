package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A05_MapDemo05 {
    public static void main(String[] args) {

        // 核心！！！HashMap的键如果存储的是自定义对象，需要重写HashCode和equals方法
        Map<Student, String> hm = new HashMap<>();

        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("王五",25);
        Student s4 = new Student("王五",25);

        hm.put(s1,"江苏");
        hm.put(s2,"浙江");
        hm.put(s3,"福建");
        hm.put(s4,"山东");

        //遍历
        Set<Student> keys = hm.keySet();
        for (Student key : keys) {
            String value = hm.get(key);
            System.out.println(key + "=" +value);
        }

        System.out.println("------------------");

        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" +value);
        }

        System.out.println("-------------------");

        hm.forEach((student, s) -> System.out.println(student + "=" + s));
    }


}
