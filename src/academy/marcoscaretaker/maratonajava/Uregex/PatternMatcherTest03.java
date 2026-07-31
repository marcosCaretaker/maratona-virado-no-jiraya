package academy.marcoscaretaker.maratonajava.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = All digits
        // \D = Anything that is not a digit
        // \s = Blank spaces \t \n \f \r
        // \S = All characters except whitespace
        // \w = a-ZA-Z, digits, _(underscore)
        // \W = Anything not included in the \w
        // []
        //String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
        String text1 = "!1k_j3f h$9a3";
        String text2 = "12 0x 0X 0xFFABC 0x119 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("Text:  " + text2);
        System.out.println("Index: 0123456789[...]");
        System.out.println("regex: "+regex);
        System.out.println("Positions found: ");
        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
