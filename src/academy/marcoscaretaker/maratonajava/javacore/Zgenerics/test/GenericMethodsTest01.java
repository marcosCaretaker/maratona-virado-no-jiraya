package academy.marcoscaretaker.maratonajava.javacore.Zgenerics.test;

import academy.marcoscaretaker.maratonajava.javacore.Zgenerics.domain.Boat;

import java.util.List;

public class GenericMethodsTest01 {
    public static void main(String[] args) {
        List<Boat> yatchList = createArrayWithOneObject(new Boat("Yatch"));
        System.out.println(yatchList);
    }
    private static <T> List<T> createArrayWithOneObject(T t){
        return List.of(t);
    }
//    private static <T extends Comparable<T>> List<T> void createArrayWithOneObject(T t){
//        List<T> list = List.of(t);
//        System.out.println(list);
//    }
}
