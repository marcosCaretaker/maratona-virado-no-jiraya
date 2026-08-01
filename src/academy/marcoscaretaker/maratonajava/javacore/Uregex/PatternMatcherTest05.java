package academy.marcoscaretaker.maratonajava.javacore.Uregex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = All digits
        // \D = Anything that is not a digit
        // \s = Blank spaces \t \n \f \r
        // \S = All characters except whitespace
        // \w = a-ZA-Z, digits, _(underscore)
        // \W = Anything not included in the \w
        // []
        //String regex = "[a-zA-C]";
        // ? Zero or one occurrence
        // * Zero or more occurrences
        // + One or more occurrences
        //{n,m} From -n- ate -m-
        // ()
        // | o(v|c)o ovo | oco
        // $
        // . 1.3 = 123,133,1@3,1A3
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail ";
        System.out.print("Valid email address: ");
        System.out.println("zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(text.split(",")));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Text:  " + text);
        System.out.println("Index: 0123456789[...]");
        System.out.println("regex: "+regex);
        System.out.println("Positions found: ");
        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
