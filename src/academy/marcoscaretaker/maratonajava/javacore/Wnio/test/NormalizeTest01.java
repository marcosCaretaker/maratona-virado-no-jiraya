package academy.marcoscaretaker.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String directoryProject = "home/caretaker/dev";
        String archiveTxt = "../../file_exercise.txt";
        Path path1 = Paths.get(directoryProject, archiveTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());

        Path path2 = Paths.get("/home/./caretaker/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
