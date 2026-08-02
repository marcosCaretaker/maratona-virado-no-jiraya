package academy.marcoscaretaker.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/caretaker");
        Path clazz = Paths.get("/home/caretaker/documents/scripts/HelloWorld.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absolute1 = Paths.get("/home/caretaker");
        Path absolute2 = Paths.get("/user/local");
        Path absolute3 = Paths.get("/home/caretaker/documents/scripts/HelloWorld.java");
        Path related1 = Paths.get("temp");
        Path related2 = Paths.get("temp/temp.21454");

        System.out.println("1 "+absolute1.relativize(absolute3));
        System.out.println("2 "+absolute3.relativize(absolute1));
        System.out.println("3 "+absolute1.relativize(absolute2));
        System.out.println("4 "+related1.relativize(related2));
        System.out.println("4 "+absolute1.relativize(related1)); // will throw an exception
    }
}
