import java.util.stream.Stream;

public class StreamDemo05 {

  public static void main(String[] args) {
    //零散数据
    Stream.of(1, 2, 3, 4, 5, "000").forEach(System.out::println);
  }
}

