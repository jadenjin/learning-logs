import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo02 {

  public static void main(String[] args) {
    //1. 单列集合获取Stream流
    ArrayList<String> list = new ArrayList<>();
    Collections.addAll(list,"a","b","c");
    list.stream().forEach(System.out::println);
  }

}
