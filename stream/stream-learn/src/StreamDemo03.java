import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class StreamDemo03 {

  public static void main(String[] args) {
    HashMap<String,Integer> list = new HashMap<>();
    list.put("a",1);
    list.put("b",2);
    list.put("c",3);
    list.put("d",4);
    list.keySet().stream().forEach(System.out::println);

    list.entrySet().stream().forEach(System.out::println);
  }

}
