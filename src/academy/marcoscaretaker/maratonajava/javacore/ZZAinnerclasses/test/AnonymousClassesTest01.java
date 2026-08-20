package academy.marcoscaretaker.maratonajava.javacore.ZZAinnerclasses.test;

class Animal{
    public void walk(){
        System.out.println("Animal walking");
    }
}
class Cat extends Animal{
    @Override
    public void walk() {
        System.out.println("Cat walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Something is walking");
            }
            public void jump(){
                System.out.println("Something is jump");
            }//Don´t work
        };
        cat.walk();
        animal.walk();
    }
}
