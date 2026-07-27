package academy.marcoscaretaker.maratonajava.javacore.Oexception.exception.test;

import academy.marcoscaretaker.maratonajava.javacore.Oexception.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionTest01 {
    public static void main(String[] args) {

        try {
            login();
        } catch (InvalidLoginException e) {
            throw new RuntimeException(e);
        }

    }
    public static void login() throws InvalidLoginException{
        Scanner keyboard = new Scanner(System.in);
        String usernameDB = "Dominic";
        String passwordDB = "Famil1y";
        System.out.println("User: ");
        String enteredUsername = keyboard.nextLine();
        System.out.println("Password: ");
        String enteredPassword = keyboard.nextLine();
        if(!enteredUsername.equals(usernameDB) || !enteredPassword.equals(passwordDB)){
            throw new InvalidLoginException("Invalid username or password");
        }
        System.out.println("User successfully logged in");
    }
}
