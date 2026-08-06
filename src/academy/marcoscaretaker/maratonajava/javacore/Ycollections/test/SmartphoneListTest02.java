package academy.marcoscaretaker.maratonajava.javacore.Ycollections.test;

import academy.marcoscaretaker.maratonajava.javacore.Ycollections.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest02 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("98A147","Apple","iPhone 17 pro max");
        Smartphone smartphone2 = new Smartphone("20D937","Xiaomi","Note 12s");
        Smartphone smartphone3 = new Smartphone("23C485","Samsung","Galaxy A56");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(0,  smartphone3);
        for(Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }
        Smartphone smartphone4   = new Smartphone("23C485","Samsung","Galaxy A56");

        System.out.println(smartphones.contains(smartphone4));
        int indexSmartphone = smartphones.indexOf(smartphone4);
        System.out.println(indexSmartphone);

    }
}
