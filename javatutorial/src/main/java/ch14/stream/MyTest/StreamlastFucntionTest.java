package ch14.stream.MyTest;

import java.util.stream.Stream;

public class StreamlastFucntionTest {
    public static void main(String[] args) {
        String[] strArr = {"Test", "Java", "Python"};
        Stream.of(strArr).forEach(System.out::println);
        
        boolean result = Stream.of(strArr).anyMatch((s)->s.equals("Java"));
        System.out.println("result = " + result);
        
        int count1 = Stream.of(strArr).mapToInt((s)->s.length()).reduce(0,(a,b)->a+1);
        System.out.println("count = " + count1);

        long count2 = Stream.of(strArr).mapToInt((s)->s.length()).count();
        System.out.println("count = " + count2);
    }
}
