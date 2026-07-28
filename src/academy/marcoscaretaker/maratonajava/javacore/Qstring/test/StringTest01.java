package academy.marcoscaretaker.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "Gabriel"; // String constant pool
        String name2 = "Gabriel";
        name = name.concat(" Nascimento"); // name += " Nascimento";
        System.out.println(name);
        System.out.println(name == name2);
        String name3 = new String("Gabriel"); // 1 Reference variable, 2 String object, 3 a String in the String pool
        System.out.println(name2 == name3);
        System.out.println(name2 == name3.intern());
    }
}
