package academy.marcoscaretaker.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        //List names = new ArrayList(); //1.4
        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        names.add("Tarantino");
        names.add("Pulp");
        names2.add("Fiction");
        names2.add("Django");

        names.addAll(names2);

        for (String name : names){
            System.out.println(name);
        }
        System.out.println("##########");
        for (int i = 0; i < names.size();i++) {
            System.out.println(names.get(i));
        }
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
    }
}
