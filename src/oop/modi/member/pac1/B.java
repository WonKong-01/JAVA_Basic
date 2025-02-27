package oop.modi.member.pac1;

public class B {

    void test() {
        A a1 = new A(50); // public
        A a2 = new A(5.55); // default
//        A a3 = new A(true); (x) ->  private 클래스만 달라져도 접근 못함

        a1.f1 = 20;
        a1.f2 = 30;
//        a1.f3 = 40; (x) -> private

        a1.m1();
        a1.m2();
//        a1.m3(); (x) -> private
    }

}
