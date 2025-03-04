package etc.api.lang.string;

public class StrTest {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();


//        String str = "a";
//        for (int i = 0; i < 500000; i++) {
//            str += "a";
//        }


        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i < 500000; i++) {
            sb.append("a");
        }


        long end = System.currentTimeMillis();

        System.out.println("실행 결과: " + (end - start) * 0.001 + "초");

        System.out.println("=======================================");

        // java 의 Math.round 는 무조건 첫째자리만 반올림
        // 첫째자리 뒤 자릿수의 반올림 수를 알고 싶으면
        // round 에 전달을 할 때 알고 싶은 자리수 만큼 곱하고 출력할때 나눠줘야함
        double pi = 3.141592;
        long result = Math.round(pi);
        System.out.println("result = " + result);

    }
}
