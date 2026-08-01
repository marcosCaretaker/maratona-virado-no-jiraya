package academy.marcoscaretaker.maratonajava.javacore.Vio.test;
// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.text.txt");
        try(FileWriter fw = new FileWriter(file,true)) {
            fw.write("This course will help me change my life and, as a result, my family's life as well.\nI won't fail\n");
            fw.flush();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
