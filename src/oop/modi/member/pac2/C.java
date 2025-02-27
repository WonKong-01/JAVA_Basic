package oop.modi.member.pac2;

import oop.modi.member.pac1.A;

public class C {

    void test() {
        A a1 = new A(50); // public
//        A a2 = new A(5.55); (x) ->  default 패키지가 달라지면 접근 못함
//        A a3 = new A(true); (x) ->  private 클래스만 달라져도 접근 못함

        a1.f1 = 20;
//        a1.f2 = 30; (x) -) default
//        a1.f3 = 40; (x) -> private

        a1.m1();
//        a1.m2(); (x) -> default
//        a1.m3(); (x) -> private
    }

}
