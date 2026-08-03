package academy.marcoscaretaker.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path archiveZip = Paths.get("folder/archive.zip");
        Path archivesToZip = Paths.get("folder/subfolder1/subsubfolder1");
        zip(archiveZip,archivesToZip);

    }
    private static void zip(Path archiveZip,Path archivesToZip){
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(archiveZip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(archivesToZip)){
            for(Path file : directoryStream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file,zipStream);
                zipStream.closeEntry();
            }
            System.out.println("Archive create with success");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
