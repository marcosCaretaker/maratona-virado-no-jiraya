package academy.marcoscaretaker.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Teresa";

    void print(String lastName){
        class LocalClass{
            public void printLocal(){
                System.out.println(name+" "+lastName);
            }
        }
        new LocalClass().printLocal();
    }
    public static void main(String[] args) {
        OuterClassesTest02 outerClass = new OuterClassesTest02();
        outerClass.print("Lisbon");
    }
}
