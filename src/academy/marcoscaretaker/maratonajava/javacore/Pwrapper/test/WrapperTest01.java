package academy.marcoscaretaker.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP =1;
        int intP = 1;
        long longP = 10L;
        float floatP = 1.1F;
        double doubleP = 1D;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW =1;
        Integer intW = 1;// autoboxing
        Long longW = 10L;
        Float floatW = 1.1F;
        Double doubleW = 1D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing
        boolean verdadeiro = Boolean.parseBoolean("TrUe");

        System.out.println(Character.isDigit('0'));
        System.out.println(Character.isDigit('M'));
        System.out.println(Character.isLetterOrDigit('%'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
