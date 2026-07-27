package academy.marcoscaretaker.maratonajava.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Person {
    public void save() throws InvalidLoginException, FileNotFoundException{
        System.out.println("Saving the \"Person\" class");
    }
}
