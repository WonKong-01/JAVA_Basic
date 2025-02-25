package Basic.loop;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {

        /*
        int j = 1; // begin
        int total = 0; // 누적합을 기억시킬 변수
        while (j <= 10) { // end
            total += j;   //복합 대입 연산자 사용   // total = total + j; (이렇게도 가능)
            j++; // step
        }
         */

        int total = 0;
        for (int j = 1; j <= 10; j++) {
            total += j;
        }

        // 1 ~ 200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를 가로로 출력
        for (int i = 1; i <= 200; i++) {
            if (i % 6 == 0 && i % 12 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n===============================================================");

        // 정수를 하나 입력받아서
        // 입력받은 정수까지의 팩토리얼 값을 구하세요.
        // 팩토리얼) 5! -> 5 x 4 x 3 x 2 x 1

        Scanner sc = new Scanner(System.in);;

        System.out.print("정수 입력: ");
        int num = sc.nextInt();

        int fac = 1;  // 팩토리얼 최종 값을 담을 변수
        for (int i = num; i >= 1; i--) {
            fac *= i;  // 누적 합계 -=, +=, *=, /=, %=
        }

        System.out.printf("%d! = %d\n", num, fac);

    }
}
