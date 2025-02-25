package Basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {

        String[] foods = {"피자", "파스타", "치킨", "삼겹살"};
//        foods[1] = "탕수육";
//        System.out.println(Arrays.toString(foods));

        Scanner sc = new Scanner(System.in);

        System.out.print("찾고 싶은 음식을 입력하세요: ");
        String name = sc.next();

         /*
             - 자바에서는 문자열 동등 비교 시 '==' 연산자를
              사용하면 제대로 비교가 되지 않습니다.

             - 문자열 String 타입이 기본 데이터 타입이 아닌
              객체 참조 타입이기 때문입니다.
              객체 참조 타입은 해당 값을 직접 들고 있는 게 아니라
              객체의 주소값을 들고 있기 때문에,
              문자열이 아무리 같더라도 주소가 다르면 false를
              도출합니다.

             - 그러므로 문자열 동등 비교를 진행할 때는
             [비교문자열1.equals(비교문자열2)] 를 사용하여
             진행해야 합니다.
        */

        boolean flag = false;
        for (int i = 0; i < foods.length; i++) {
            if (name.equals(foods[i])) { // '==' 연산자는 기본 타입끼리만 사용가능 String은 객체 참조 타입이라 사용 불가
                System.out.println("탐색 완료");
                System.out.println("Index: " + i + "번");
                flag = true;
                break;
            }
        }
            if (!flag) {
                System.out.println("없는 음식입니다.");
            }




        System.out.println("=========================================");


        for (int i = 0; i < foods.length; i++) {
            if (name.equals(foods[i])) { // '==' 연산자는 기본 타입끼리만 사용가능 String은 객체 참조 타입이라 사용 불가
                System.out.println("탐색 완료");
                System.out.println("Index: " + i + "번");
                break;
            } else if (i == foods.length - 1) {
                System.out.println("없는 음식입니다.");
            }
        }


        System.out.println("=======================================");



        int idx = -1;
        for (int i = 0; i < foods.length; i++) {
            if (name.equals(foods[i])) { // '==' 연산자는 기본 타입끼리만 사용가능 String은 객체 참조 타입이라 사용 불가
                System.out.println("탐색 완료");
                System.out.println("Index: " + i + "번");
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            System.out.println("없는 음식입니다.");
        }

    }
}
