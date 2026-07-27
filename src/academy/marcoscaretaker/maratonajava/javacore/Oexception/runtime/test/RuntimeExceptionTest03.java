package academy.marcoscaretaker.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        System.out.println(openConnection());
    }

    @org.jetbrains.annotations.Nullable
    private static String openConnection() {
        try {
            System.out.println("Opening a file");
            System.out.println("Writing data to the file");
            return "open connection";
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("Closing a feature enabled by the operating system");

        }
        return null;
    }
}
