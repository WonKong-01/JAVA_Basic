package etc.collection.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // 추가

        list.add("홍길동");
        list.add("김철수");
        list.add("박영희");

        list.addFirst("맨 앞");
        list.addLast("맨 뒤");
        System.out.println("list = " + list);

        System.out.println(list.get(3));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.remove("맨 앞");
        System.out.println("list = " + list);

        System.out.println("==============================================");

        // List -> last In, first Out -> Stack
        // push, pop, peak
//        list.push({"춘식이");
//        System.out.println("list = " + list);

        // 삭제 하면서 데이터를 얻기
        System.out.println(list.pop());
        System.out.println("list = " + list);

        // 삭제하지 않으면서 참조
        System.out.println(list.peek());
        System.out.println("list = " + list);

        // FIFO => first In, First -> Queue
        // offer, pool, peek
        list.offer("a");
        list.offer("b");
        list.offer("c");
        System.out.println("list = " + list);  // 뒤에서부터 추가

        System.out.println(list.poll());
        System.out.println("list = " + list);

        System.out.println(list.peek());
        System.out.println("list = " + list);
    }
}
