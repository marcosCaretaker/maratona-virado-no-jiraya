package academy.marcoscaretaker.maratonajava.javacore.ZZAinnerclasses.test;

public class OuterClassesTest02 {
    private final String name = "Rigsby";

    public void print(final String serie){
        final String firstName = "Wayne";
        class LocalClass{
            public void printName(){
                System.out.println("The "+firstName+" "+name+" did a great job on "+serie);
            }
        }
        new LocalClass().printName();
    }
    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("The Mentalist");
    }
}
