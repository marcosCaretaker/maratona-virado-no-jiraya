package academy.marcoscaretaker.maratonajava.javacore.Bintroducaometodos.test;

import academy.marcoscaretaker.maratonajava.javacore.Bintroducaometodos.domain.Calculator;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.divideDoisNumeros(19992,7);
        System.out.println(result);
    }
}
