package oop.constructor;

import oop.basic.Pen;

public class Main {
    public static void main(String[] args) {

//        Phone basic = new Phone();
//        basic.model = "폴더폰";
//        basic.color = "회색";
//        basic.price = 200000;
//        basic.showSpec();

        Phone basic = new Phone();
        basic.showSpec();

        System.out.println("==============================================");

        Phone galaxy = new Phone("갤럭시 s25");
        galaxy.showSpec();

        System.out.println("==============================================");

        Phone iphone = new Phone("아이폰 16", "스페이스그레이");
        iphone.showSpec();


    }
}
