package academy.marcoscaretaker.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        double result = number01 / (double) number02;
        System.out.println(result);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 10;
        System.out.println(isDezDiferenteVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);

        // && (and) || (or) !
        int age = 29;
        float salary = 3500f;
        boolean isInsideTheLawGreaterThanThirty = age >= 30 && salary >= 4612;
        boolean isInsideTheLawUnderThirty = age < 30 && salary >= 3381;
        System.out.println("isInsideTheLawGreaterThanThirty "+isInsideTheLawGreaterThanThirty);
        System.out.println("isInsideTheLawUnderThirty "+isInsideTheLawUnderThirty);
        double totalCheckingAccountBalance = 200;
        double totalSavingsAccountValue = 10000;
        float valuePlaystation = 5000f;
        boolean isPlaystationFiveBuyable = totalCheckingAccountBalance >= valuePlaystation || totalSavingsAccountValue >= valuePlaystation;
        System.out.println("I'll have the money to buy it ? "+ isPlaystationFiveBuyable);

        // =, +=, -=, *=, /=, %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);
        // ++ --
        int accountant = 0;
        accountant += 1;
        System.out.println(accountant);
        accountant++;
        System.out.println(accountant);
        accountant--;
        System.out.println(accountant);
        // The inverted version also works—it increments first.
        int accountant2 = 0;
        ++accountant2;
        System.out.println("Inverted: "+accountant2);
     }
}
