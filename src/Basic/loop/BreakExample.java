package Basic.loop;

public class BreakExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 5) break; // 중괄호 안에 들어갈 조건이 한줄이면 중괄호 생략 가능함 (한 줄이라도 길면 가독성 해칠 수 있기 때문에 지양)
            // i가 5가 되는 순간 break 걸리기 때문에 4까지 결과 도출

            System.out.print(i + " ");
        }
        System.out.println("\n반복문 종료!");


        System.out.println("======================================");

        /*
         - 내부 반복문에 포함된 break로 바깥쪽 반복문까지 한번에
          종료시키고 싶다면 바깥쪽 반복문에 label을 붙입니다.
          그리고, break 선언 시 label을 함께 선언합니다.
         */


        // 외부 반복문에 outer라는 레이블을 붙혀놓고 break outer; 라는 명령을 하게 되면
        // 내부 반복문에서 레이블한 반복문으로 나올 수 있음

        outer: for (int i = 0; i <= 2; i++) {
            for (int j =0; j <= i; j ++){
                if (i == j) break;  // break는 자신이 포함된 반복문에만 탈출 가능함
                System.out.println(i + "-" + j);
            }
        }
    }
}
