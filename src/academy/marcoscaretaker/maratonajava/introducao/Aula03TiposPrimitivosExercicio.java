package academy.marcoscaretaker.maratonajava.introducao;

/*
* Exercise
 *
 * Create variables for the fields described below, enclosed in <>, and print the following message:
*
* I, <name>, residing at <address>, confirm that I received my salary of <salary> on <data>.
* */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Marcos";
        String adress = "rua b n' 8";
        double salary = 2431.00;
        String receiptSalaryDate = "05/01/2026";
        String message = "I,"+name+", residing at "+adress+", confirm that I received my salary of R$"+salary+" on "+receiptSalaryDate;
        System.out.println(message);
    }
}
