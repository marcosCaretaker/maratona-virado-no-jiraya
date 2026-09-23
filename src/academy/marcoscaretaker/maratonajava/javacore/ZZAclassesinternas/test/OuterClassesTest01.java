package academy.marcoscaretaker.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Patrick Jane";
    private String serieName = "The Mentalist";
    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(serieName);
        }
    }
    public static void main(String[] args) {
        // Way one
        System.out.println("Way one: ");
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        inner.printOuterClassAttribute();
        // Way two
        System.out.println("Way two: ");
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner2.printOuterClassAttribute();
        System.out.println("led to the same result");

    }
}
