import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo04 {

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9};

    String[] arr2 = {"ad","bf","3ce"};
    Arrays.stream(arr).forEach(System.out::println);
    System.out.println("============================================================");
    Arrays.stream(arr2).forEach(System.out::println);
    System.out.println("============================================================");
    //数组必须是引用数据类型
    Stream.of(arr2).forEach(s-> System.out.println(s));
  }

}
