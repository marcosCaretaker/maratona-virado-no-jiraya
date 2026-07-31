package academy.marcoscaretaker.maratonajava.pratices.Miniagenda.result;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        while(true){
            System.out.println("Digite o nome do compromisso:");
            String appointmentName = keyboard.nextLine();
            System.out.println("Digite a data do compromisso:");
            String appointmentDate = keyboard.nextLine();

            System.out.println("Digite a prioridade:(1,2,3)");
            String priority = keyboard.nextLine();
        }
    }
}