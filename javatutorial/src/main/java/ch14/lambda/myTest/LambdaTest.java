package ch14.lambda.myTest;

import java.util.function.BiFunction;

public class LambdaTest {
    int max(int a, int b){
        return a > b ? a:b;
    }
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> max = (a,b)-> a> b ? a:b;

        System.out.println("max.apply(3,5) = " + max.apply(3,5));


    }
}
