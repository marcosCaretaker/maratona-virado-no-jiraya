package academy.marcoscaretaker.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
         // Using the switch statement and the values 1 through 7, print whether it is a weekday or a weekend.
         // Treating 1 as Sunday
        byte day = 5;
        switch (day){
            case 1:
            case 7:
                System.out.println("weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("weekday");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
