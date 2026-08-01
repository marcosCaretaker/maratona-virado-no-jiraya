package academy.marcoscaretaker.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.text.txt");
        try(FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("This course will help me change my life and, as a result, my family's life as well.I won't fail");
            bw.newLine();
            bw.flush();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
