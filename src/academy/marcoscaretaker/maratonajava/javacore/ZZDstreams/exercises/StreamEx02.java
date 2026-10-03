package academy.marcoscaretaker.maratonajava.javacore.ZZDstreams.exercises;

import academy.marcoscaretaker.maratonajava.javacore.ZZDstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Solo Leveling", 4.99),
            new LightNovel("Classroom Elite", 3.50),
            new LightNovel("Chainsaw Man", 4.49),
            new LightNovel("Goblin Slayer", 6.25),
            new LightNovel("Tokyo Ghoul", 8),
            new LightNovel("Blue Lock", 2.99),
            new LightNovel("Death Note", 10.00),
            new LightNovel("Spy Family", 3.99)));
    public static void main(String[] args){
        List<String> strings = lightNovels.stream()
                .filter(ln -> ln.getTitle().length() > 10)
                .map(ln -> ln.getTitle().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(strings);
    }
}
