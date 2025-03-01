package oop.poly.car;

public class CarShop {

     /*
        Mammals
           |
         Person
           |
        Student

        Mammals m = new Student();
        m instanceof Person -> true         //instanceof : 좌항의 객체가 우항의 타입을 가질 수 있니? 라고 이해
                                            // 좌항이 우항이니? (x)
     */

    public void carPrice(Car c) {  // 매개변수에 다형성을 대입 (부모 변수를 매개변수로)
        if (c instanceof Sonata) {
            System.out.println("소나타의 가격은 3000만원 입니다.");
        } else if (c instanceof Tesla) {
            System.out.println("테슬라의 가격은 1억입니다.");
        } else if (c instanceof Porsche) {
            System.out.println("포르쉐의 가격은 2억입니다.");
        }
    }

}
