package academy.marcoscaretaker.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest001 {
    public static void main(String[] args) {
        List<String> strings = List.of("Harry", "Luke", "Rocky", "Indiana");
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        forEach(strings,s -> System.out.println(s));
        forEach(integers,i -> System.out.println(i));
    }
    private static <T> void forEach(List<T> list, Consumer consumer){
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
