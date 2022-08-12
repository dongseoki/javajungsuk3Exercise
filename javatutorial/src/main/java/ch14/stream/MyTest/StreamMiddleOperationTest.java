package ch14.stream.MyTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMiddleOperationTest {
    public static void main(String[] args) {
        IntStream.range(1,20).skip(3).limit(10).filter((i)->i%2==0).sorted().forEach(System.out::println);

        String[] strArr = {"asdf", "sss", "ccc","ddd", "c324"};
        Arrays.stream(strArr).sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
