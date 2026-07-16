package academy.marcoscaretaker.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Print all even numbers from 0 to 1,000,000
        int count = 11;
        int million = 100000;
        while(count <= million){
            if(count == 0){
                System.out.println("0 não é um numero par e nem impar.");
                count++;
            }
            if(count % 2 == 0){
                System.out.println(count);
            }
            count++;
        }
        System.out.println("Descansar né que o cara não é de ferro.");
    }
}
