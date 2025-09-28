package Streams;
import java.util.ArrayList;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(3000);
        salaryList.add(4100);
        salaryList.add(9000);
        salaryList.add(5000);
        salaryList.add(1000);
        salaryList.add(3500);

        long output = salaryList.stream().filter( (Integer sal) -> sal>3000).count();
        System.out.println("Total emp with salary > 3000 is -: " + output);


        // Intermediate Operations

        // 1. Filter()
        Stream <String> nameStream = Stream.of("HELLO","EVERYBODY","HOW","ARE","YOU","DOING");
        Stream <String> filteredStream = nameStream.filter( (String name) -> name.length() <= 3);
        List<String> filteredNameList = filteredStream.collect(Collectors.toList());
        System.out.println(filteredNameList);

        // 2. Map()
        Stream <String> mapname = Stream.of("HELLO","EVERYBODY","HOW","ARE","YOU","DOING");
        Stream<String> filteredName = mapname.map((String name) -> name.toLowerCase());
        List<String> mapList = filteredName.collect(Collectors.toList());
        System.out.println(mapList);

        // 3. flatMap()
        List<List<String>> sentenseList = Arrays.asList(
                Arrays.asList("I", "LOVE", "JAVA"),
                Arrays.asList("CONCEPT", "ARE", "CLEAR"),
                Arrays.asList("ITS", "VERY", "EASY")
        );


        Stream<String> wordsStream = sentenseList.stream()
                .flatMap( (List<String> sentense) -> sentense.stream());
        List<String> printWordsStream = wordsStream.collect(Collectors.toList());
        System.out.println(printWordsStream);

        Stream<String> wordsStream2 = sentenseList.stream()
                .flatMap( (List<String> sentense) -> sentense.stream()
                                .map( (String value) -> value.toLowerCase())
                        );
        List<String> printWordsStream2 = wordsStream2.collect(Collectors.toList());
        System.out.println(printWordsStream2);

        // 4. distinct()
        Integer[] arr = {1,4,2,7,4,4,2,8,9};
        Stream<Integer> arrStream = Arrays.stream(arr).distinct();
        List<Integer> printDistinct = arrStream.collect(Collectors.toList());
        System.out.println(printDistinct);


        // 5. Sorted
        Integer[] Sarr = {1,5,2,7,7,4,4,2,0, 9};
        Stream<Integer> arrstream = Arrays.stream(arr).sorted();
        List<Integer> sortedstream = arrstream.collect(Collectors.toList());
        System.out.println(sortedstream);


        // 6. peek()
        List<Integer> numbers =Arrays.asList(2,1,3,4,6);
        Stream<Integer> numberStream  = numbers.stream()
                .filter((Integer val)-> val>2)
                .peek((Integer val) -> System.out.print(val + " "))
                .map((Integer val) -> -1*val);
        List<Integer> numberList = numberStream.collect(Collectors.toList());
        System.out.println(numberList);

        // 7. limit()
        List<Integer> limit = Arrays.asList(2,1,3,4,6);
        Stream<Integer> limitStream = numbers.stream().limit(3);
        List<Integer> limitList = limitStream.collect(Collectors.toList());
        System.out.println(limitList);

        // 8. Skip()
        List<Integer> numberSkip = Arrays.asList(1,2,3,4,5,6,7);
        Stream<Integer> numberSkipStream = numberSkip.stream().skip(3);
        List<Integer>  printSkip = numberSkipStream.collect(Collectors.toList());
        System.out.println(printSkip);

        // MapToInt()
        List<String> mapnumber = Arrays.asList("2","1","3","7");
        IntStream mapStream = mapnumber.stream().mapToInt((String val) -> Integer.parseInt(val));

        int[] mapArray = mapStream.toArray();
//        List<Integer> maparr = mapStream.collect(Collectors.toList());
//        System.out.print(maparr);

//        int[] mapArr = {2,1,4,7};
//        IntStream mapNum = Arrays.stream(mapArr);
//        mapNum.filter((int val) -> val>2);
//        int[] filtermaparr = mapStream.toArray();


    }
}
