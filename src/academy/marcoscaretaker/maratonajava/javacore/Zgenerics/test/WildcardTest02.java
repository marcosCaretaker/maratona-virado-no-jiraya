package academy.marcoscaretaker.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog("Bobb"),new Dog("klain"));
        List<Cat> cats = List.of(new Cat("French"),new Cat("Japan"));
        List<Animal> animalsList = new ArrayList<>(2);
        printConsultDog(animalsList);
    }
    public static void printConsult(List<? extends Animal> animals){
        System.out.println("------");
        for (Animal animal : animals) {
            animal.consult();
        }
    }

    public static void printConsultDog(List<? super Animal> animals){
        System.out.println("------");
        Animal a = new Dog("BatDog");
        Animal b = new Cat("Spain");
        animals.add(new Dog("Daemon"));
        animals.add(a);
        animals.add(new Cat("Greece"));
        animals.add(b);
        for(Object obj: animals){
            if(obj instanceof Dog){
                Dog d = (Dog) obj;
                d.consult();
            }
        }
    }
}
