package TreeMap;

import java.util.TreeMap;

public class A09_TreeMapDemo02 {
    public static void main(String[] args) {
        TreeMap<Student,String> treeMap = new TreeMap<>();

        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",20);
        Student s3 = new Student("王五",29);
        treeMap.put(s1,"江苏");
        treeMap.put(s2,"安徽");
        treeMap.put(s3,"北京");

        System.out.println(treeMap);
    }
}
