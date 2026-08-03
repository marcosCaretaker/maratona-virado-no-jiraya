package academy.marcoscaretaker.maratonajava.javacore.Wnio.test;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class findAllTestJavaOrClass extends SimpleFileVisitor<Path>{
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");

    @Override
    public @NotNull FileVisitResult visitFile(@NotNull Path file, @NotNull BasicFileAttributes attrs) throws IOException {
        if(matcher.matches(file)){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class PatchMatcherTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root,new findAllTestJavaOrClass());
    }
}
