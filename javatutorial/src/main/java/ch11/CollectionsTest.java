package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CollectionsTest {
    public static void main(String[] args) {
        Set<Integer> testSet = new HashSet<>();
        testSet.add(1);
        testSet.add(2);
        testSet.add(3);
        Set<Integer> unmodiSet = Collections.unmodifiableSet(new HashSet<>(testSet));
        unmodiSet.add(4);
    }
}
