package ch14.stream.MyTest;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        int result =Optional.of("12342").filter(x->x.length()>0).map(Integer::parseInt).orElse(-1);
        // orElse는 혹시나 연산의 결과가 0일때만 대체한다 생각하자.
        // 위의 of 메서드에 인자로 "asdf"라고 적으면 파싱에서 당연히 에러 뜬다. 이것은 optional로 해결가능한 문제가 아니며
        // 추가 조치가 필요한다.
//      //   책 837pg를 참고하자.
        System.out.println("result = " + result);

        Optional.of("1234").map(Integer::parseInt).ifPresent(x-> System.out.println(""+x));
//        Optional.of("asdf").map(Integer::parseInt).ifPresent(x-> System.out.println(""+x));
    }
}
