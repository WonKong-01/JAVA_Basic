package oop.poly.basic;

/*
- 자바에서는 하나의 클래스 파일에 여러 개의 클래스를 선언할 수 있습니다.
 밀접한 연관이 있는 클래스를 모아 놓기 위해 사용합니다.
- 단, 파일명과 동일한 클래스가 반드시 존재해야 하고,
 해당 클래스만 public으로 선언할 수 있습니다.
*/

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

/*
          Object
            |
            A
         /    \
        B     C
        |     |
        D     E
 */

public class Basic {

    void method1() {

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

         A v1 = new B();
         A v2 = new C();
         A v3 = new D();
         A v4 = new E();

         B v5 = new D();
         C v6 = new E();


         // 상속 관계가 아니라면 다형성 적용이 불가능합니다.
        // 부모가 같다고 자식끼리의 관계가 있는 것은 아닙니다.
//        B v7 = new C();
//        C v8 = new B();
//        B v9 = new E();

        // Object 는 자바의 최상위 클래스입니다.
        // 모든 객체는 Object 의 자식입니다.
        // Object 타입의 변수에는 어떠한 객체도 들어올 수 있습니다.
        Object o1 = new A();
        Object o2 = new B();
        Object o3 = new C();
        Object o4 = new D();
        Object o5 = new E();
        Object o6 = new Basic();
        Object o7 = new String("안녕하세요");
    }

}
