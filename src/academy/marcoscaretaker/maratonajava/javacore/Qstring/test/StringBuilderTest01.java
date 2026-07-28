package academy.marcoscaretaker.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Marcos";
        name.concat(" Caretaker");
        System.out.println(name);
        StringBuilder sb = new StringBuilder("Marcos");
        sb.append(" Caretaker").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0,7);
        System.out.println(sb);
    }
}
