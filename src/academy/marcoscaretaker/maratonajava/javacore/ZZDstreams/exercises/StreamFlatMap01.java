package academy.marcoscaretaker.maratonajava.javacore.ZZDstreams.exercises;

import java.util.ArrayList;
import java.util.List;

public class StreamFlatMap01 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William", "David", "Harisson");
        List<String> students = List.of("Édipo", "Gustavo Lima", "Gustavo Mendes","Guilherme");
        devDojo.add(graphicDesigners);
        devDojo.add(developers);
        devDojo.add(students);

        devDojo.stream()
                .flatMap(innerList -> innerList.stream())
                .forEach(System.out::println);
    }
}
