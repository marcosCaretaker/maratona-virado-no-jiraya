package academy.marcoscaretaker.maratonajava.javacore.ZZDstreams.test;

import academy.marcoscaretaker.maratonajava.javacore.ZZDstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static final List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Solo Leveling", 4.99),
            new LightNovel("Classroom Elite", 3.50),
            new LightNovel("Goblin Slayer", 6.25),
            new LightNovel("Overlord", 5.99),
            new LightNovel("Sword Art Online", 4.50),
            new LightNovel("Re Zero", 4.99),
            new LightNovel("No Game Life", 3.99),
            new LightNovel("Toradora", 3.25),
            new LightNovel("Konosuba", 3.99)));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
        long count = lightNovels.stream()
                .distinct()
                .filter(ln -> ln.getPrice() < 4)
                .count();
        System.out.println(count);
    }
}
