package academy.marcoscaretaker.maratonajava.javacore.Bintroducaometodos.test;

import academy.marcoscaretaker.maratonajava.javacore.Bintroducaometodos.domain.Calculator;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1 = 1;
        int num2 = 2;
        calculator.alteraDoisNumeros(num1,num2);

        System.out.println("Dentro do CalculadoraTest03: ");
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
    }
}
