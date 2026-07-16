package academy.marcoscaretaker.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int[] numbersTwo = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbersTwo.length; i++) {
            System.out.println(numbersTwo[i]);
        }
        System.out.println("-----SEPARANDO-----");
        for (int num : numbersTwo) {
            System.out.println(num);
        }
    }
}
