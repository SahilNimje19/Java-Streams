package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTerminalOperation {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,1,4,7,3,4,9);
        num.stream()
                .filter((Integer val) -> val>=3)
                .forEach((Integer val) -> System.out.println(val + " "));

        // toArray()

        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        Object[] filterNumberArrayType1 =numbers.stream()
                .filter((Integer val) -> val>=3)
                .toArray();
        Integer[] filterNumberArraytype2 = numbers.stream()
                .filter((Integer val) -> val>=3)
                .toArray((int size) -> new Integer[size]);

        // reduce()
        List<Integer> num1 = Arrays.asList(2,1,2);
        Optional<Integer> reducedValue = num1.stream()
                .reduce((Integer val1, Integer val2) -> val1+val2); // Associate aggregation function
        // 2+1+2=5 like this
        System.out.println();
        System.out.println("The reduce value is : " + reducedValue.get()); // 5

        // collect
        List<Integer> num2 = Arrays.asList(2,1,4,3,2);
        List<Integer> filteredNumber = num2.stream()
                .filter((Integer val) -> val>=3)
                .collect(Collectors.toList());



        // min and max
        List<Integer> num3 = Arrays.asList(2,1,4,7,10);
        Optional<Integer> minimumValueType1 = num3.stream()
                .filter((Integer val) -> val>=3)
                .min((Integer val1, Integer val2) -> val1-val2);
        System.out.println("The minimum value is : " + minimumValueType1.get());

        Optional<Integer> minimumValueType2 = num3.stream()
                .filter((Integer val) -> val>=3)
                .min((Integer val1, Integer val2) -> val2-val1);
        System.out.println(minimumValueType2.get());


        // anymatch()
        List<Integer> num4 = Arrays.asList(2,1,4,7,10);
        boolean hasvalueGreaterThenThree = num4.stream()
                .anyMatch((Integer val) -> val>=3);
        System.out.println(hasvalueGreaterThenThree);

        // findfirst()
        List<Integer> num5 = Arrays.asList(2,1,4,7,10);
        Optional<Integer> firstValue = num5.stream()
                .filter((Integer val) -> val>=3)
                .findFirst();
        System.out.println(firstValue.get());

    }
}
