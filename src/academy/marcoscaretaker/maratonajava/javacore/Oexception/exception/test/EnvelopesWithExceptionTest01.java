package academy.marcoscaretaker.maratonajava.javacore.Oexception.exception.test;

import academy.marcoscaretaker.maratonajava.javacore.Oexception.exception.domain.Functionary;
import academy.marcoscaretaker.maratonajava.javacore.Oexception.exception.domain.Person;

public class EnvelopesWithExceptionTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        Functionary functionary = new Functionary();
        functionary.save();
    }
}
