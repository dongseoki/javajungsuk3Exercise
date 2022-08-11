package ch14.lambda;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lambda_Method_Reference {
    public static void main(String[] args) {
//		Function<String,Integer> f = (String s)->Integer.parseInt(s);
        Function<String,Integer> f = Integer::parseInt;
        System.out.println(f.apply("100")+200);

        //		Supplier<MyClass> s = ()-> new MyClass();
        Supplier<MyClass> s = MyClass::new;
        System.out.println(s.get());

        //		Function<Integer,MyClass> fs = (i)->new MyClass(i);
        Function<Integer,MyClass> fs = MyClass::new;
        System.out.println(fs.apply(19));
        System.out.println((fs.apply(19)).iv);

        //		Function<Integer,int[]> fr = (i)->new int[i];
        Function<Integer,int[]> fr = int[]::new;
//		System.out.println(fr.apply(15).length);
        int[] arr = fr.apply(15);
        System.out.println(arr.length);
        for(int i=0; i<arr.length; i++)
            arr[i]=(int)(Math.random()*15 +1);
        System.out.println(Arrays.toString(arr));
    }
}
class MyClass{
    int iv;
    MyClass() {};
    MyClass(int iv){
        this.iv = iv;
    }
}