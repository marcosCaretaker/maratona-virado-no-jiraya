package academy.marcoscaretaker.maratonajava.javacore.ZZBcomportamento.interfaces;

import academy.marcoscaretaker.maratonajava.javacore.ZZBcomportamento.domain.Guitar;
@FunctionalInterface
public interface GuitarPredicate {
    //Anonymous, functions, concise
    boolean test(Guitar guitar);
    //(parameter) -> (expression)
    //(Guitar guitar) -> guitar.getColor().equals("black")
}
