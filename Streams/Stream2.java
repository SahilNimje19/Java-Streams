package Streams;

import java.util.Arrays;
import java.util.List;
import java.lang.Integer;
import java.util.stream.Stream;
// Intermediate Operation Lazy
public class Stream2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        Stream<Integer> numbersStream = numbers
                .stream()
                .filter((Integer val) -> val>=3)
                .peek((Integer val) -> System.out.println(val + " "));

        numbersStream.count();


//            for printing thr data from above operation
//        List<Integer> numberprint = numbersStream.toList();
//        System.out.println("the output is " + numberprint);

//        "A Java Stream can only be consumed once. After a terminal
//        operation, the stream is closed. If you need to reuse the data,
//        collect it into a collection and operate on that instead of
//        reusing the same stream."
    }
}
