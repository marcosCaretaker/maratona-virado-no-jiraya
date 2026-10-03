package academy.marcoscaretaker.maratonajava.javacore.ZZDstreams.exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//I would return a new List<String> containing all names from every sublist, applying two requirements:converting all names to uppercase
//and sorting the final collection in alphabetical order.
public class StreamFlatMap04 {
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
                .map(name -> name.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collected);
    }
}
