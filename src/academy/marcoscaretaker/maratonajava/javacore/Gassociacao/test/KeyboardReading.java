package academy.marcoscaretaker.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class KeyboardReading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Name: ");
        String name = input.nextLine();
        System.out.println("Age: ");
        int age = input.nextInt();
        System.out.println("Sex: ");
        char sex = input.next().charAt(0);
        System.out.println("--- --- --- ---");
        System.out.print("Name: " + name + " Age: " + age + " Sex: " + sex);

    }
}
