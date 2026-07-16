package academy.marcoscaretaker.maratonajava.introducao;

public class Aula07ArraysExercicio01 {
    public static void main(String[] args) {
        // filtrando elemenos de um array
        int[] numbers = new int[21];
        for (int i = 0; i < 21; i++) {
            numbers[i] = i + 1;
        }

        System.out.println("Todos os numeros no array: ");

        for(int num : numbers){
            System.out.println(num);
        }
        System.out.println("Todos os pares: ");
        for (int num : numbers){
            if(num % 2 == 0){
                System.out.println(num);
            }
        }
    }
}
