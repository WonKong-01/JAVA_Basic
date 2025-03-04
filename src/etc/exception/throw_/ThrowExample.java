package etc.exception.throw_;

import etc.exception.custom.InvalidArgumentExample;

public class ThrowExample {

    static int calcTotal(int end) throws Exception {
        if (end <= 0) {
//            System.out.println("잘못된 입력값 입니다.");
            throw new InvalidArgumentExample("매개값 X");  //
        }
        int total = 0;
        for (int i = 1; i < end; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        try {
            int result1 = calcTotal(100);
            System.out.println("result1 = " + result1);

            int result2 = calcTotal(-120);
            System.out.println("result2 = " + result2);
        } catch (Exception e) {
            System.out.println("입력값에 이상이 있어서 리턴이 되지 못함");
            e.printStackTrace();
        }


    }
}
