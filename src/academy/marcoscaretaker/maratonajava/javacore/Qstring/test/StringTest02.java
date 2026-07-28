package academy.marcoscaretaker.maratonajava.javacore.Qstring.test;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "    Walker    "; // Paul Walker :)
        String numbers = "0123456789";
        System.out.println(name);
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.replace("k","l"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(numbers.length());
        System.out.println(numbers.substring(4));
        System.out.println(name.trim());
    }
}
