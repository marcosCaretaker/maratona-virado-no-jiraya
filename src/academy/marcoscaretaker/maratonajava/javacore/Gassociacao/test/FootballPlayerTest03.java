package academy.marcoscaretaker.maratonajava.javacore.Gassociacao.test;

import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.domain.Team;
import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.domain.FootballPlayer;

public class FootballPlayerTest03 {
    public static void main(String[] args) {
        FootballPlayer player1 = new FootballPlayer("Lamine Yamal");
        FootballPlayer player2 = new FootballPlayer("Aymeric");
        FootballPlayer player3 = new FootballPlayer("David Raya");
        FootballPlayer player4 = new FootballPlayer("Rodri");
        FootballPlayer player5 = new FootballPlayer("Ferran Torres");

        Team team1 = new Team("Espanha");

        FootballPlayer[] players = {player1, player2, player3, player4, player5};

        team1.setPlayers(players);

        player1.setTeam(team1);
        player2.setTeam(team1);
        player3.setTeam(team1);
        player4.setTeam(team1);
        player5.setTeam(team1);

        System.out.println("--- Player ---");
        player1.print();
        System.out.println("--- Player ---");
        player2.print();
        System.out.println("--- Player ---");
        player3.print();
        System.out.println("--- Player ---");
        player4.print();
        System.out.println("--- Player ---");
        player5.print();
        System.out.println("--- Team ---");
        team1.print();

    }
}
