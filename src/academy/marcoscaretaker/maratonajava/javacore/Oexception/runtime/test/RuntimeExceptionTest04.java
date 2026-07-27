package academy.marcoscaretaker.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArrayStoreException();
        } catch (IllegalArgumentException e) {
            System.out.println("Inside the catch: IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Inside the catch: ArithmeticException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside the catch: IndexOutOfBoundsException");
            // More general exceptions always come at the end
        } catch (ArrayStoreException e) {
            System.out.println("Inside the catch: ArrayStoreException");
        }

        try {
            maybeThrowException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void maybeThrowException() throws SQLException, FileNotFoundException {

    }
}