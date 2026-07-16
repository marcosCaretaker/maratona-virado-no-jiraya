package academy.marcoscaretaker.maratonajava.javacore.Bintroducaometodos.test;

import academy.marcoscaretaker.maratonajava.javacore.Bintroducaometodos.domain.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.somaDoisNumbers();
        calculator.subtraiaDoisNumeros();
        calculator.multiplicaDoisNumeros(4,10.5F);
    }
}
