import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo01 {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("张无忌");
    list.add("张三丰");
    list.add("赵强");

     list.stream().filter(name -> name.startsWith("张"))
        .filter(name -> name.length() == 3).forEach(System.out::println);

//    ArrayList<String> list1 = new ArrayList<>();
//    for (String name : list) {
//
//      if (name.startsWith("张")) {
//        list1.add(name);
//      }
//    }
//    System.out.println(list1);
//
//    ArrayList<String> list2 = new ArrayList<>();
//    for (String name : list1) {
//
//      if (name.length() == 3) {
//        list2.add(name);
//      }
//
//    }
//    System.out.println(list2);


  }
}
