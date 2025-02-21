package Basic.begin;

public class Identifier {
    public static void main(String[] args) {

        // 1. 식별자는 대/소문자를 철저하게 구분함
        int age = 35;
//        int age = 45; (x)
        int Age = 45;

        // 2. 식별자는 숫자로만 이루어지거나 숫자로 시작하면 앋됨
//        int 700 = 365; (x)
//        int 7number = 7; (x)
        int number7 = 7;
        int num7ber = 7;

        // 3. 식별자에 공백 못들어감
//        int my birth day = 000000; (x)
        int MyBrithDay = 000000; // camel case 표기법

        // 4. 식별자에 특수기호는 밑줄(_), 달러기호($) 뿐이다.
        // 사용을 권장하지는 않는다. 이미 사용하기로 약속한 곳이 있다.
        String $hello_ = "안녕";

        // 5. 키워드 (예약어)는 식별자로 사용할 수 없음
        // 키워드란 이미 어떠한 기능을 내포하고 있는 단어.
//        String class = "8반"; (x)
        String Class = "8반"; // 가능은 하지만 권장하지는 않음
        String myClass = "8반";
        String classNumber = "8반";

        // 6. 한글이나 한자 같은 식별자도 문법적으로 허용하기는 하지만
        // 권장하지는 않음
        int 숫자 = 10;
        int sagwa = 20;
    }

}
