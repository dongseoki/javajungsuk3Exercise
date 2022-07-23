package ch06;

public class MyVarArgsTest {
    public static void main(String[] args) {
        echo("hi", "my", "name", "is", "dongseok");
        echo(new String[]{"hi", "nice to meet you"});
    }

    public static void echo(String... input){
        for (String word:input
             ) {
            System.out.println(word);
            System.out.println(word);
        }
    }
}
