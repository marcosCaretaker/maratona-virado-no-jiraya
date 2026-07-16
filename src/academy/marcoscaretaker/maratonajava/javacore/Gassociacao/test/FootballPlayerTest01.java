package academy.marcoscaretaker.maratonajava.javacore.Gassociacao.test;

import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.domain.FootballPlayer;

public class FootballPlayerTest01 {
    public static void main(String[] args) {
        FootballPlayer footballPlayer1 = new FootballPlayer("Lamine Yamal");
        FootballPlayer footballPlayer2 = new FootballPlayer("Mbappe");
        FootballPlayer footballPlayer3 = new FootballPlayer("Neymar");

        FootballPlayer[] players = {footballPlayer1,footballPlayer2,footballPlayer3};

        for (FootballPlayer player : players) {
            player.print();
        }


    }
}
