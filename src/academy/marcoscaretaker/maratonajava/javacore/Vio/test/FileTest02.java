package academy.marcoscaretaker.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDirectory = new File("folder");
        boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println("IsDirectoryCreated? " + isDirectoryCreated);
        File fileArchiveDirectory = new File(fileDirectory, "archive.txt");
        try {
            boolean isFileCreated = fileArchiveDirectory.createNewFile();
            System.out.println("isFileCreated? " + isFileCreated);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File fileRenamed = new File(fileDirectory, "archive_renamed.txt");
        boolean isFileRenamed = fileArchiveDirectory.renameTo(fileRenamed);
        System.out.println("IsFileRenamed? " + isFileRenamed);

        File directoryRenamed = new File("folder-2");
        boolean isDirectoryRenamed = fileDirectory.renameTo(directoryRenamed);
        System.out.println("IsDirectoryRenamed? " + isDirectoryRenamed);
    }
}
