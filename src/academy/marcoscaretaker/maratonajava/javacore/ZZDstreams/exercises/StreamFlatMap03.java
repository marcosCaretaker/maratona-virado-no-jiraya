package academy.marcoscaretaker.maratonajava.javacore.ZZDstreams.exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//Using the stream API,I would calculate the total number of people across all sublists and store the final result in a long variable.
public class StreamFlatMap03 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William", "David", "Harisson");
        List<String> students = List.of("Édipo", "Gustavo Lima", "Gustavo Mendes","Guilherme");
        devDojo.add(graphicDesigners);
        devDojo.add(developers);
        devDojo.add(students);

        long count = devDojo.stream()
                .flatMap(Collection::stream)
                .count();
        System.out.println(count);
    }
}
