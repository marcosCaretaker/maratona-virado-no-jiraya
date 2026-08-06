package academy.marcoscaretaker.maratonajava.javacore.Ycollections.test;

import academy.marcoscaretaker.maratonajava.javacore.Ycollections.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("102A9100C6","Apple","iPhone 15");
        Smartphone smartphone2 = new Smartphone("102A9100C6","Apple","iPhone 15");
        Smartphone smartphone3 = new Smartphone("8216587265","Samsung","Galaxy A56");
        System.out.println(smartphone1.equals(smartphone2));

    }
}
