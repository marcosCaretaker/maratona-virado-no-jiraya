package academy.marcoscaretaker.maratonajava.javacore.ZZDstreams.test;

import academy.marcoscaretaker.maratonajava.javacore.ZZDstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
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
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 6));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() < 0));
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);
        System.out.println("-----");
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println("-----");
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
    }
}
