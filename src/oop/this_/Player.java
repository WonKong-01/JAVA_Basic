package oop.this_;

public class Player {

    // 필드 선언
    String nickName;
    int level;
    int hp;

    public Player() {
        System.out.println("Player의 기본 생성자 호출");
        level = 1;
        hp = 50;
    }

    public Player(String nickName) {
        System.out.println("Player의 2번 생성자 호출");
        System.out.println("this가 띠는 주소값: " + this);
        this.nickName = nickName;
        level = 1;
        hp = 50;
    }

//    @Override
//    public String toString() {
//        return "Player{" +
//                "nickName='" + nickName + '\'' +
//                ", level=" + level +
//                ", hp=" + hp +
//                '}';
    }

