package etc.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.XMLFormatter;

public class MappingApple {

    // 사과의 색상만 추출
    public static List<Color> mappingAppleByColor(List<Apple> apples) {
        List<Color> colorList = new ArrayList<>();
        for (Apple apple : apples) {
           colorList.add(apple.getColor());
        }
        return colorList;
    }

    // 어떤 리스트를 받아도 맵핑이 가능한 전역 메서드를 선언해보자
    public static <X, Y> List<Y> map(List<X> list, GenericFunction<X, Y> mapper) {
        List<Y> mappedList = new ArrayList<>();
        for (X x : list) {
            // X에서 Y를 추출하는 동작이 반복 -> 이 동작은 파라미터화 시키자

            Y y = mapper.apply(x);
            mappedList.add(y);
        }
        return mappedList;
    }












































































}
