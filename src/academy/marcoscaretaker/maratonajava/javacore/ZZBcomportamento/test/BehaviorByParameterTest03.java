package academy.marcoscaretaker.maratonajava.javacore.ZZBcomportamento.test;

import academy.marcoscaretaker.maratonajava.javacore.ZZBcomportamento.domain.Guitar;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorByParameterTest03 {

    private static List<Guitar> guitars = List.of(new Guitar("sunburst",1954), new Guitar("olympic white",1962), new Guitar("fiesta red",1965), new Guitar("black",1979), new Guitar("daphne blue",1986));

    public static void main(String[] args) {
        List<Guitar> blackGuitars = filter(guitars,guitar -> guitar.getColor().equals("black"));
        List<Guitar> beforeYearGuitar = filter(guitars,guitar -> guitar.getYearOfManufacture() < 1970);
        System.out.println(blackGuitars);
        System.out.println(beforeYearGuitar);
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        System.out.println(filter(nums,num -> num % 2 == 0));
        System.out.println(filter(nums,num -> num % 2 != 0));
    }
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if(predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
