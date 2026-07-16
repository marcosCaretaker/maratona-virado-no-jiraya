package academy.marcoscaretaker.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isAuthorizedToBuyDrink = age >= 18;
        if (isAuthorizedToBuyDrink) {
            System.out.println("Authorized to purchase alcoholic beverages.");
        } else {
            System.out.println("Don´t authorized to purchase alcoholic beverages.[else]");
        }
        if(!isAuthorizedToBuyDrink) {
            System.out.println("Don´t authorized to purchase alcoholic beverages.");
        }
        boolean c = false;
        if (c = true) {
            System.out.println("Inside something that should never have existed.");
        }
        System.out.println("Outside the if");

    }
}
