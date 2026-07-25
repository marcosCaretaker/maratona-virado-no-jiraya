package academy.marcoscaretaker.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        createNewArchive();
    }
    private static void createNewArchive(){
        File file = new File("archive\\test.txt");
        try{
            boolean isCreated = file.createNewFile();
            System.out.println("Archive created: "+isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
