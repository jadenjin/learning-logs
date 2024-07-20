import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo06 {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    Collections.addAll(list, "jdc-111", "jdc-222", "jdc-333");
    list.stream().map(new Function<String, Integer>() {
      @Override
      public Integer apply(String s) {
        String[] split = s.split("-");
        String s1 = split[1];
        int i = Integer.parseInt(s1);
        return i;
      }
    }).forEach(s -> System.out.println(s));

    list.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(System.out::println);
  }

}
