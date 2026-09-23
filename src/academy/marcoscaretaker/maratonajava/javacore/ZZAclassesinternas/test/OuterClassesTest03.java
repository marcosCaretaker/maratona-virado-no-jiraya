package academy.marcoscaretaker.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "Red";
    static class Nested{
        private String lastName = "Jhon";
        void print(){
            System.out.println(new OuterClassesTest03().name+" "+lastName);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
