package oop.Inherit.product;

public class Main {
    public static void main(String[] args) {

        Television tv = new Television("Samsung TV", 2000000, "Samsung", 55);
        SmartPhone phone = new SmartPhone("iPhone 13", 890000, "Apple", 256);

        System.out.println("TV Info:");
        tv.displayInfo();

        System.out.println("\nSmartphone Info:");
        phone.displayInfo();

        /*
        문제: 전자 제품 매장 관리 시스템
요구사항
기본 클래스 ElectronicProduct 생성

이 클래스는 모든 전자 제품의 기본이 되는 클래스입니다.
속성:
productName (제품명, 문자열)
price (가격, 실수형)
manufacturer (제조사, 문자열)
메소드:
생성자: 모든 속성을 매개변수로 받아 초기화합니다.
displayInfo(): 제품의 정보를 출력하는 메소드. 출력 예: "Samsung TV, 가격: 2000000원, 제조사: Samsung"
서브 클래스 Television 생성

ElectronicProduct의 서브 클래스입니다.
추가 속성:
screenSize (화면 크기, 정수형)
메소드:
생성자: 기본 클래스의 속성과 screenSize를 초기화합니다.
displayInfo() 메소드를 오버라이드하여 화면 크기 정보도 포함하여 출력합니다.
서브 클래스 Smartphone 생성

ElectronicProduct의 서브 클래스입니다.
추가 속성:
storageCapacity (저장 용량, 정수형)
메소드:
생성자: 기본 클래스의 속성과 storageCapacity를 초기화합니다.
displayInfo() 메소드를 오버라이드하여 저장 용량 정보도 포함하여 출력합니다.
구현할 사항
Main 클래스에 main 메소드를 구현하여, 각각의 제품 (TV와 스마트폰) 인스턴스를 하나씩 생성하고, 각 제품의 정보를 출력하는 코드를 작성합니다.
         */
    }
}
