package academy.marcoscaretaker.maratonajava.javacore.ZZDstreams.exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//After flattening the collection,I would write a solution that returns a new List<String> containing only the names,
//from any team,that start with the letter 'G'.
public class StreamFlatMap02 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William", "David", "Harisson");
        List<String> students = List.of("Édipo", "Gustavo Lima", "Gustavo Mendes","Guilherme");
        devDojo.add(graphicDesigners);
        devDojo.add(developers);
        devDojo.add(students);

        List<String> collected = devDojo.stream()
                .flatMap(Collection::stream)
                .filter(name -> name.startsWith("G"))
                .collect(Collectors.toList());
        System.out.println(collected);
    }
}
