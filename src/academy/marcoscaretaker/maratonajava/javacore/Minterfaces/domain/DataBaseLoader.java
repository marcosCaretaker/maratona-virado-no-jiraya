package academy.marcoscaretaker.maratonajava.javacore.Minterfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Loading data from the database");
    }

    @Override
    public void remove() {
        System.out.println("Deleting data from my database");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking database permissions");
    }

    public static void retriaveMaxDataSize(){
        System.out.println("Inside the retriaveMaxDataSize method in the databaseLoader class");
    }

}
