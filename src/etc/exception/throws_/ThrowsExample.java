package etc.exception.throws_;

public class ThrowsExample {

    static String[] greetings = {"안녕", "hello", "니하오"};

     /*
     # throws

     - throws는 예외의 원인이 메서드 선언부가 아닌 호출부에 있을 경우
      예외 처리를 메서드의 호출부로 떠넘기는 방식입니다.

     - throws는 생성자에서도 선언이 가능하며, 메서드나 생성자를 호출 시
      예외 처리를 강요하고 싶을 때 사용합니다.

     - 또한, 원하는 영역으로 예외를 모아서 한번에 처리하는 것도 가능합니다.
     */

    static void greet(int idx) throws Exception { // throws 는 호출부에 예외를 강제하는 키워드
        System.out.println(greetings[idx]);
    }

    public static void main(String[] args) { // main 에 throws 처리를 하면 예외 처리를 안하겠다는 말 main 에는 붙이면 x

        try {
            greet(3);
        } catch (Exception e) {
            System.out.println("메서드의 매개값이 잘못되었어요");
        }

        // throws 호출부에 예외 처리를 경고 강제하기 위해서
        // throws 호출부에 예외 처리를 강제 하기 때문에 예외 처리 할 부분이 많을 때 호출부에만 예외 처리를 하면 되기 때문에 코드 정리에 편리

    }
}
