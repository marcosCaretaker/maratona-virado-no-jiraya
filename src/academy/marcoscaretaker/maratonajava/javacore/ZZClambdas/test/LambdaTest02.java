package academy.marcoscaretaker.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Mia", "Brian");
        List<Integer> integers = map(strings, s -> s.length());
        List<String> list = map(strings, s -> s.toUpperCase());
        System.out.println(integers);
        System.out.println(list);
        System.out.println(strings);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
