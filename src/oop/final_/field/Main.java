package oop.final_.field;

public class Main {
    public static void main(String[] args) {

        Person kim = new Person("김철수");
//        kim.name = "김철순"; (x)
//        kin.name = "미국"; (x) -> final 변수로 생성되어 있으면 변경이 불가함

        Person park = new Person("박영희");
//        park.name = "영국";  (x)



    }
}
