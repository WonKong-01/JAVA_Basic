package Basic.loop;

public class WhileExample2 {
    // 1000의 약수의 개수를 출력하세요.
    int k = 1;
    int count = 0;

    public static void main(String[] args) {

        // 48 ~ 150 사이의 정수 중 8의 배수만 가로로 출력해 보세요.

        //내 답

        int i = 48;
        int total = 0;
        while (i <= 150) {

            i++;
        }

        //풀이
        int j = 48;
        while (j <= 150) {
            if (j % 8 == 0) {
                System.out.print(j + " ");
            }
            j++;    // step이 조건문 안으로 안들어가도록 주의
        }
        System.out.println(); // 단순 줄 개행


        // 1 ~ 100까지의 정수 중 4의 배수이면서
        // 8의 배수는 아닌 수를 가로로 출력해 보세요.

        //내 답

//        int a = 1;
//        while (a <= 100) {
//            if (a % 4 == 0) {
//                if (a % 8 == 0)
//            }
//
//            j++;
//        }

        //풀이

        int n = 1;
        while (n <= 100) {
            if (n % 4 == 0 && n % 8 != 0) {
                System.out.print(n + " ");
            }
            n++;
        }


        // 1 ~ 30000 까지의 정수 중 258의 배수의 개수를 출력

        //내 답
//        int s = 1;
//        int d = 0;
//        while (s <= 30000) {
//            if (s % 258 == 0) {
//                d += d + 1;
//                System.out.println(d + "개");
//            }
//
//            s++;
//        }

        //풀이
        int v = 1;
        int cnt = 0;
        while (v <= 30000) {
            if (v % 258 == 0) {
                cnt++;

            }
            v++;
        }
        System.out.print("cnt = " + cnt);


        // 1000의 약수의 개수를 출력하세요.
        int k = 1;
        int count = 0;
        while (k<= 1000) {
            if (1000 % k == 0) {
                count++;
            }
            k++;
        }
        System.out.println("count = " + count);
    }
}















