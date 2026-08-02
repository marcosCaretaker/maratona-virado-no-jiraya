package academy.marcoscaretaker.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path directory = Paths.get("home/caretaker");
        Path archive = Paths.get("dev/file_exercise.txt");
        Path resolve = directory.resolve(archive);
        System.out.println("Resolve:"+resolve);

        Path pathAbsolute = Paths.get("/home/caretaker");
        Path pathRelated = Paths.get("dev");
        Path file = Paths.get("file.txt");
        System.out.println("Absolute -> Related:  "+pathAbsolute.resolve(pathRelated));
        System.out.println("Absolute -> File:     "+pathAbsolute.resolve(file));
        System.out.println("Related -> Absolute:  "+pathRelated.resolve(pathAbsolute));
        System.out.println("Related -> File:      "+pathRelated.resolve(file));
        System.out.println("File -> Absolute:     "+file.resolve(pathAbsolute));
        System.out.println("File -> Relative:     "+file.resolve(pathRelated));
    }
}
