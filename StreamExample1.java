import java.util.*;
import java.util.stream.*;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("입력데이터=" +numbers);

        List<Integer> result = numbers.stream()
                                    .filter(n -> {return n % 2 == 0;})
                                    .map(n -> { return n*n;})
                                    .collect(Collectors.toList());
        System.out.println("실행결과="+result);
    }
}