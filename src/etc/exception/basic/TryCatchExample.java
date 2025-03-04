package etc.exception.basic;

import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수1: ");
        int i = sc.nextInt();

        System.out.print("정수2: ");
        int j = sc.nextInt();

        try {
            // try 블록에는 예외 발생 가능성이 있는 코드를 배치합니다.
            System.out.printf("%d / %d = %d\n", i, j, i / j);
        } catch (Exception e) {
            // catch 블록에는 try 에서 실제 예외가 발생했을 시
            // 실행할 내용을 작성합니다.
            System.out.println("0으로 나눌 수 없습니다.");
            e.printStackTrace();
        }

        // 오류가 발생하면 자바 자체에 생성되어 있는 객체가 생성이 됨
        // 그 객체는 자신을 받아줄 수 있는 catch 문을 차례로 검색
        // Exception 은 대부분의 오류 상황에 동작하는 객체
        // Exception 타입의 객체는 자바의 많은 예외들 중 최상위 클래스 (부모)
        // 다형성 적용

        System.out.println("프로그램 정상 종료");
        sc.close();
    }
}
