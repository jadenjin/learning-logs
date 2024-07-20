import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class StreamDemo07 {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    Collections.addAll(list, "jdc-111", "jdc-222", "jdc-333");
    //遍历

    list.stream().forEach(System.out::println);

    System.out.println(list.stream().count());

    String[] array = list.stream().toArray(String[]::new);

    System.out.println(Arrays.toString(array));

    ArrayList<String> list2 = new ArrayList<>();
    Collections.addAll(list2, "李四-男-20", "王五-女-22", "赵六-男-18", "孙七-女-25", "周八-男-30",
        "吴九-女-27", "郑十-男-35", "钱十一-女-29", "刘十二-男-33", "陈十三-女-24");

    list2
        .stream()
        .filter(s -> "男".equals(s.split("-")[1]))
        .collect(Collectors.toSet())
        .forEach(System.out::println);
  }

}
