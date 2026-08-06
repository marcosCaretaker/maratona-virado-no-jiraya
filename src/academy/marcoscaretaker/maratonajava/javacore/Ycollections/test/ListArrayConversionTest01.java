package academy.marcoscaretaker.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversionTest01 {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        Integer[] listToArray = values.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println(" --- --- --- --- ---");
        Integer[] valuesArray = new Integer[3];
        valuesArray[0] = 1;
        valuesArray[1] = 2;
        valuesArray[2] = 3;
        List<Integer> arrayTolist = Arrays.asList(valuesArray);
        arrayTolist.set(0,10);
        System.out.println(Arrays.toString(valuesArray));
        System.out.println(arrayTolist);
        System.out.println(" --- --- --- --- ---");
        List<Integer> valueList = new ArrayList<>(Arrays.asList(valuesArray));
        valueList.add(20);
        System.out.println(valueList);
        List<String> stringList = Arrays.asList("1", "2", "3");

    }
}
