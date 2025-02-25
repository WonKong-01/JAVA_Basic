package Basic.loop;

public class LoopNesting2 {
    public static void main(String[] args) {

        /*

         *
         **
         ***
         ****
         *****

         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("==========================================");

        /*
             *
            **
           ***
          ****
         *****
         */

        for (int i = 1; i <= 5; i++) {
            //별 찍기 전에 공백부터 만드는 for문
            for (int k = 4; k >= i; k--) {
                System.out.print(" ");
            }
            //별 찍는 for문
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("===============================================");

        /*
        *****
         ****
          ***
           **
            *
         */

        // 내 답

//        for (int q = 5; q >= 1; q--) {
//            // 공백 for문
//            for (int w = 1; w <= q; w++) {
//                System.out.print(" ");
//            }
//            // 별 찍기 for문
//            for (int e = 5; e >= q; q--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //풀이

        for (int t = 1; t <= 5; t++) {
            //별 찍기 전에 공백부터 만드는 for문
            for (int y = 0; y < t-1; y++) {
                System.out.print(" ");
            }
            //별 찍는 for문
            for (int u = 5; u >= t; u--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
