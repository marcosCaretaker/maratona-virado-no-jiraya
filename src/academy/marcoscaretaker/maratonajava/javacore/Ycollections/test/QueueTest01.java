package academy.marcoscaretaker.maratonajava.javacore.Ycollections.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> letters = new PriorityQueue<>();
        letters.add("H");
        letters.add("A");
        letters.add("Z");
        letters.add("G");
        letters.add("E");

        while(!letters.isEmpty()){
            System.out.println(letters.poll());
        }

    }
}
