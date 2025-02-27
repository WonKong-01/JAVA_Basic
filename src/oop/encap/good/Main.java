package oop.encap.good;

public class Main {
    public static void main(String[] args) {

        MyBirth my = new MyBirth();
//        my.day = 13; (x) -> private

        my.setYear(2001);
        System.out.printf("내 생일은 %d년 입니다.\n", my.getYear());

        my.setMonth(2);
        System.out.printf("내 생일은 %d월 입니다.\n", my.getMonth());

        my.setDay(31);
        System.out.printf("내 생일은 %d일 입니다.\n", my.getDay());

        my.birthInfo();

    }
}
