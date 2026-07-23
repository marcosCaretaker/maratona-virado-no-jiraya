package academy.marcoscaretaker.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;

    void load();

    default void checkPermission(){
        System.out.println("Checking permissions...");
    }

    static void retriaveMaxDataSize(){
        System.out.println("Inside the retriaveMaxDataSize method in the interface");
    }
}