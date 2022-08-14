package ch14.stream.MyTest;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        List<Integer> testList = Arrays.asList(1,2,3,4);
        testList.stream().forEach(System.out::println);

        System.out.println();

        Stream.of("a","B","C").forEach(System.out::println);

        System.out.println();

        Arrays.stream(new int[]{2,3,4,5}).forEach(System.out::println);
        System.out.println();

        IntStream.rangeClosed(1,5).forEach((i)-> System.out.println(""+ i + "hi"));
        System.out.println();

        new Random().ints().limit(3).forEach(System.out::println);

        System.out.println();
        new Random().longs(34,40).limit(5).forEach(System.out::println);
        System.out.println();

        Stream.iterate(1,n->n*2).limit(5).forEach(System.out::println);
        System.out.println();

        Stream.generate(()->2).limit(4).forEach(System.out::println);
        System.out.println();

        System.out.println("Stream.empty().count() = " + Stream.empty().count());
        System.out.println();

        Stream.concat(Stream.of(1,2),Stream.of(1,2)).forEach(System.out::println);
        System.out.println();
    }
}
