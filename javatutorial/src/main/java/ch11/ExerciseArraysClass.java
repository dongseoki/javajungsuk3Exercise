package ch11;

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseArraysClass {
    public static void main(String[] args) {
        int[][] tripmap = {{1,2,3},{1,2,3}};
        System.out.println("        Arrays.deepToString(tripmap) = " +         Arrays.deepToString(tripmap));

//        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList({4, 3, 6, 1, 6, 7, 8, 2}));

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("apple", "grape", "banana", "kiwi"));
        System.out.println(arrayList);
    }
}
