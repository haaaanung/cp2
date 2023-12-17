import java.util.*;
import java.util.stream.*;

public class StreamExample2 {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Java","Stream","Library");
        System.out.println("입력데이터 ="+data);
        List<Integer> result = data.stream()
                                    .map(String::length)
                                    .collect(Collectors.toList()); //.toList()도 가능함
        System.out.println("실행결과"+result);
    }
}