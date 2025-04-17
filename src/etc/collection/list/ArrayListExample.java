package etc.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        /*
             # ArrayList
             - 배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스.
             - 배열과 유사한 형태이기 때문에 순차적으로 데이터에 접근하기가 좋다.
             - 인덱스를 활용하며, 객체의 중복 저장을 허용한다.
         */

//        String[] nick = new String[50];

        // <> -> 제네릭 (타입의 형식을 지정하여 타입 안정성을 꾀하기 위한 문법)
        List<String> nick = new ArrayList<>();

        // add(객체) : 리스트에 객체를 추가하는 메서드
        nick.add("멍멍이");
        String str = "야옹이";
        nick.add(str);
        nick.add(new String("개구리"));
        nick.add("짹쨱이");
        nick.add("야옹이");
        System.out.println("nick = " + nick);

        System.out.println("===========================================================");

        // add(인덱스, 객체) : 원하는 위치에 객체 삽입
        nick.add(3, "어흥이");
        System.out.println("nick = " + nick);

        System.out.println("============================================================");

        // get(인덱스) : 리스트 내부의 객체를 참조
//        String str = nick.get[3];
        String name = nick.get(3);
        System.out.println("name = " + name);
        System.out.println("nick = " + nick.size());

        System.out.println("===========================================================");

        // set(인덱스, 수정할 객체) : 리스트 내부의 객체를 수정
        nick.set(2, "삐약이");
        System.out.println("nick = " + nick);

        System.out.println("===========================================================");

        // 리스트 반복문 처리
        for (int i = 0; i < nick.size(); i++) {
            System.out.println(nick.get(i));
        }

        System.out.println("===========================================================");

        for (String s : nick) {
            System.out.println(s);
        }

        // contains(객체) : 리스트 내의 객체의 존재 유무를 파악  -> boolean 타입
        System.out.println(nick.contains("삐약이"));

        System.out.println("===========================================================");

        // indexOf(객체) : 특정 객체의 인덱스 탐색, 없으면 -1 리턴
        int idx = nick.indexOf("개구리");
        System.out.println("개구리의 인덱스 = " + idx);

        System.out.println("============================================================");

        // remove(객체 or 인덱스) : 리스트 내부 객체 삭제
        nick.remove("삐약이");
        nick.remove(0);
        System.out.println("nick = " + nick);

        System.out.println("================================================================");

        // clear() : 리스트 내부요소 전체 삭제
        nick.clear();
        System.out.println("nick = " + nick);

        System.out.println("=================================================================");

        // isEmpty() : 리스트가 비어있는지의 여부 확인
        System.out.println(nick.isEmpty());

        System.out.println("==================================================================");

        /*
        # 컬렉션 객체들은 collections 의 기능을 사용할 수 있습니다.
        collections 은 컬렉션 객체들의 부가 기능들을 제공합니다.
         */

        List<Integer> score = new ArrayList<>();
        score.add(65);

        // 리스트 생성과 동시에 초기화 하기
        // asList 를 통해 리턴받은 리스트는 삽입/삭제가 불가능합니다. (고정된 크기를 가짐)
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        list.add(11);  -- 에러
        System.out.println(list);

        // 한 번에 객체 많이 추가하기
        Collections.addAll(score, 78, 100, 88, 79, 100, 21, 56, 100);
        System.out.println("score = " + score);

        // 컬렉션 내의 객체의 개수 구하기
        System.out.println("100점 학생 수 : " + Collections.frequency(score, 100));

        // 최대값, 최소값
        System.out.println("최대값 : " + Collections.max(score));
        System.out.println("최소값 : " + Collections.min(score));

        // 정령
        Collections.sort(score);
        System.out.println("score = " + score);

//        Collections.reverse(score);    단순 역순 배치 (정령 x)
        Collections.sort(score, Collections.reverseOrder());  // 내림차 정렬
        System.out.println("score = " + score);

        // 두 요소의 위치를 교체 swap(리스트, i, j)
        Collections.swap(score, 3, 7);
        System.out.println("score = " + score);

        // 리스트 내의 요소를 무작위로 섞기
        Collections.shuffle(score);
        System.out.println("score = " + score);

        // 원하는 객체로 컬렉션을 전부 초기화
        Collections.fill(score, 100);
        System.out.println("score = " + score);












    }
}
