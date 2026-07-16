package academy.marcoscaretaker.maratonajava.javacore.Bintroducaometodos.test;

import academy.marcoscaretaker.maratonajava.javacore.Bintroducaometodos.domain.Calculator;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] numeros = {1,2,3,4,5};
        calculator.somaArray(numeros);
        calculator.somaVarArgs(1,2,3,4,5,6,7,8,9,10,999);
    }
}
