package academy.marcoscaretaker.maratonajava.javacore.Zgenerics.test;

abstract class Animal{
    protected String name;
    public abstract void consult();
    public Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void consult() {
        System.out.println("Consulting dog name: "+name);
    }
}

class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    @Override
    public void consult() {
        System.out.println("Consulting cat name: "+name);
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Animal[] dogs = {new Dog("Bob"),new Dog("Zeus")};
        Animal[] cats = {new Cat("Alicia"),new Cat("Zena")};
        printConsult(dogs);
        printConsult(cats);
    }
    public static void printConsult(Animal[] animals){
        System.out.println("------");
        for (Animal animal : animals) {
            animal.consult();
        }

    }
}
