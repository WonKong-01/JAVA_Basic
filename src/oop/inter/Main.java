package oop.inter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 인터페이스와 구현체 간에도 다형성 발생이 가능합니다.
//        GameController keyboard = new KeyBoardController();
//        GameController joystick = new JoystickController();
//        GameController touchScreen = new TouchScreenController();

        GameController gc;

        Scanner sc = new Scanner(System.in);
        System.out.println("게임을 플레이 할 도구를 선택하세요.");
        System.out.println("1. 키보드 | 2. 조이스틱 | 3. 터치스크린");
        System.out.printf("> ");
        int menu = sc.nextInt();

        if (menu == 1) {
            gc = new KeyBoardController();
        } else if (menu == 2) {
            gc = new JoystickController();
        } else {
            gc = new TouchScreenController();
        }

        gc.moveCharacter("위");
        gc.action();
        gc.pause();

    }
}
