package academy.marcoscaretaker.maratonajava.javacore.Wnio.test;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) {
        Path folderPath = Paths.get("folder");
        Path subFolderPath = Paths.get("folder/subfolder/hiddenfolder");
        try {
            if (Files.notExists(folderPath)) {
                Path folderDirectory1 = Files.createDirectory(folderPath);
            }
            if(Files.notExists(subFolderPath)){
                Path subFolderDirectory1 = Files.createDirectories(subFolderPath);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Path filePath = Paths.get(subFolderPath.toString(), "file.txt");
        try {
            if (Files.notExists(filePath)) {
                Path filePathCreated = Files.createFile(filePath);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(),"file_renamed.txt");
        try {
            Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
