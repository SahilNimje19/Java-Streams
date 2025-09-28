package Streams;
// Sequence of Stream Operations

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        Stream<Integer> numberStream = numbers.stream()
                .filter((Integer val) -> val>=3)
                .peek((Integer val) -> System.out.println("After filter: " + val))
                .map((Integer val) -> (val * -1))
                .peek((Integer val) -> System.out.println("After negating: " + val))
                .sorted()
                .peek((Integer val) -> System.out.println("after sorted : " + val));

        List<Integer> filterNumberStream = numberStream.collect(Collectors.toList());
        System.out.println(filterNumberStream);

    }
}
