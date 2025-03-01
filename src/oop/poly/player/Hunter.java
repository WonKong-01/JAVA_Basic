package oop.poly.player;

public class Hunter extends Player{

    String pet;
    public Hunter(String nickName, String pet) {
        super(nickName);
        this.pet = pet;

    }


    public void magicArrow(Player target) {
        System.out.printf("%s님이 %s님에게 매직 애로우 시전!\n"
                , this.nickName, target.nickName);
        int damage; String job;  // 데미지와 맞는 직업 변수 선언
        if (target instanceof Warrior) { // 타겟이 어떤 직업이고 받는 데미지와 직업의 이름을 조건문으로
            damage = 10; job = "전사";
        } else if (target instanceof Mage) {
            damage = 20; job = "마법사";
        } else {
            damage = 15; job = "사냥꾼";
        }
        target.hp -= damage;   // 데미지를 입고 까이는 hp
        System.out.printf("%s님(%s)이 %d의 피해를 입었습니다.\n"
                ,target.nickName, job, damage);  // 피해를 입었다는 알림 코드
        System.out.printf("%s님의 남은 체력: %d\n", target.nickName, target.hp);  // 남은 체력의 알림 코드
        System.out.println("---------------------------------------------");

    }

}
