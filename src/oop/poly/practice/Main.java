package oop.poly.practice;

public class Main {
    public static void main(String[] args) {

        Computer myComputer = new Computer();
        myComputer.addPart(new Processor("Intel i7", 320000));
        myComputer.addPart(new Memory("Corsair Vengeance 16GB", 90000));
        myComputer.addPart(new HardDrive("Samsung SSD 1TB", 150000));

        myComputer.showParts();

        /*
        문제: 컴퓨터 부품 관리 시스템
배경
컴퓨터 조립 시 다양한 종류의 부품이 사용됩니다. 각 부품은 고유한 특성을 가지고 있지만, 공통적인 특성들도 있습니다. 이 시스템에서는 컴퓨터 부품의 공통 특성을 하나의 기본 클래스로 정의하고, 각 부품 종류를 이 클래스의 서브 클래스로 구현하여 다형성을 실습합니다.

요구사항
기본 클래스 ComputerPart 정의

속성:
partName (부품 이름, 문자열)
partPrice (부품 가격, 정수형)
메소드:
describePart(): 부품의 이름과 가격을 출력합니다.
서브 클래스 구현

Processor, Memory, HardDrive 등의 클래스를 ComputerPart의 서브 클래스로 만듭니다.
각 클래스는 describePart 메소드를 자신의 방식대로 구현합니다.
부품 관리 클래스 Computer 생성

속성:
parts: 컴퓨터 부품 객체들을 관리하는 ComputerPart[].
메소드:
addPart(ComputerPart part): 컴퓨터에 부품을 추가합니다.
showParts(): 컴퓨터의 모든 부품 설명을 출력합니다.
구현할 사항
ComputerPart 클래스와 그 서브 클래스들을 구현합니다.
Computer 클래스에서 부품 관리 기능을 구현합니다.
Main 클래스에서 컴퓨터 부품을 추가하고, 모든 부품의 정보를 출력하는 시뮬레이션을 실행합니다.
         */
    }
}
