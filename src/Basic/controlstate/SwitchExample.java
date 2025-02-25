package Basic.controlstate;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("성별을 입력하세요. (M/F): ");
        String gender = sc.next();

        switch (gender) {
            // java 14버전 이후 개선된 switch 문 (case "ㅡ", "m", "M":) <-으로 사용가능
//            case "m":  <- 위 아래로도 가능
            case "ㅡ": case "m": case "M":       // java 14버전 이전 사용 가능
                System.out.println("남성입니다.");
                break; // 해당 케이스만 실행하고 switch문을 종료해라!


            case "F":
                System.out.println("여성입니다.");
                break;

            default: // case를 설정하지 않은 값들은 모두 default로 빠짐
                System.out.println("잘못된 입력입니다.");
        }

        sc.close();
    }

}
