package academy.marcoscaretaker.maratonajava.javacore.ZZAclassesinternas.test;
class Animal{
    public void walk(){
        System.out.println("Animal walking");
    }
}
public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.walk();
        Animal dog = new Animal(){
            @Override
            public void walk() {
                System.out.println("Dog walking");
            }
        };
        dog.walk();
    }
}
