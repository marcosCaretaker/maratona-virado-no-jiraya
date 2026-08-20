package academy.marcoscaretaker.maratonajava.javacore.ZZBparameterization.test;

import academy.marcoscaretaker.maratonajava.javacore.ZZBparameterization.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorParameterizationTest03 {
    private static List<Car> cars = List.of(new Car("Fusca","blue",1975),new Car("Uno","white",1987),new Car("Fusca","red",1995),new Car("Uno","blue",1998));
    public static void main(String[] args) {
        List<Car> white = filter(cars, car -> car.getColor().equals("white"));
        System.out.println(white);
        List<Car> red = filter(cars, car -> car.getColor().equals("blue"));
        System.out.println(red);
        List<Car> uno = filter(cars, car -> car.getName().equals("Uno"));
        System.out.println(uno);
        List<Car> yearBefore = filter(cars, car -> car.getYear() < 1990);
        System.out.println(yearBefore);
        List<Car> yearAfter = filter(cars, car -> car.getYear() > 1990);
        System.out.println(yearAfter);
        System.out.println("===========");
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(numbers,num -> num % 2 == 0));
    }
    private static <T> List<T> filter(List<T> list,Predicate<T> predicate){
        List<T> filtered = new ArrayList<>();
        for (T e:list){
            if(predicate.test(e)){
                filtered.add(e);
            }
        }
        return filtered;
    }
}
