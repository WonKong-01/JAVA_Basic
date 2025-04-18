package Basic.begin;

public class VariableExample {
    public static void main(String[] args) {

        /*
         # 변수 (Variable)

         1. 변수는 데이터가 저장되는 공간에 이름을 붙여놓은 것입니다.
         2. 변수는 생성할 때 변수에 저장되는 데이터의 크기와 모양에 따라
         적당한 데이터 타입을 선언해야 합니다.
         ex) int: 4바이트의 정수, String: 문자열(문장)
         3. 변수는 동일한 이름으로 중복 선언할 수 없습니다.
         4. 변수 내부의 값은 언제든지 변경이 가능합니다.
         */

        // 변수의 선언 : [자료형(데이터타입)] [변수명]
        int age;

        // 변수의 초기화 : [변수명] = [값]
        age = 50;

        // 변수의 값 참조 (사용)
        System.out.println(age);

        // 변수의 값 참조 (사용) 2
        System.out.println("age = " + age);

        // 변수의 값 참조 (사용) 3 (soutv)
        System.out.println("age = " + age);

        // 변수는 선언과 동시에 초기화하는 것이 가능
        int score = 50;
            // int score = 90; (x) 변수는 중복 선언 x

        score = 90; // 데이터 타입이 안붙었다? -> 기존의 변수를 지목한다.

        // 변수에는 다른 변수의 값도 저장이 가능
        int myScore = score;

        // 변수에는 다른 변수의 값도 저장이 가능 2
        myScore = score - 20;

        System.out.println("myScore = " + myScore);
        System.out.println("score = " + score);

        // 변수의 타입에 맞지 않는 값은 저장이 불가능
        // int count = "한번"; (x) 문자열 안됨
        // int count = 23.5; (x) 소수 안됨
        // String str = 100; (x) 숫자 안됨

        // 데이터 타입이 달라도 이름이 중복되었다면 허용 x
        String name = "홍길동";
        // int name = 1004; (x)

        // int result = myScore = num; (x)을 선언한 적 없음

        int result;
        // System.out.println("result = " + result); (x) 초기화가 필요
    }
}
