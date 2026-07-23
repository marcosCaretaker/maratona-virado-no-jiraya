package academy.marcoscaretaker.maratonajava.javacore.Minterfaces.test;

import academy.marcoscaretaker.maratonajava.javacore.Minterfaces.domain.DataBaseLoader;
import academy.marcoscaretaker.maratonajava.javacore.Minterfaces.domain.DataLoader;
import academy.marcoscaretaker.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retriaveMaxDataSize();
        DataBaseLoader.retriaveMaxDataSize();
    }
}
