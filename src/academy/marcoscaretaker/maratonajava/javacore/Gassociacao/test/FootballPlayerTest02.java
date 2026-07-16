package academy.marcoscaretaker.maratonajava.javacore.Gassociacao.test;

import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.domain.Team;
import academy.marcoscaretaker.maratonajava.javacore.Gassociacao.domain.FootballPlayer;

public class FootballPlayerTest02 {
    public static void main(String[] args) {
        FootballPlayer player1 = new FootballPlayer("Kaio Jorge");
        FootballPlayer player2 = new FootballPlayer("Matheus Cunha");
        FootballPlayer player3 = new FootballPlayer("Cássio Moura");
        Team team1 = new Team("Cruzeiro FC");
        player1.setTeam(team1);
        player2.setTeam(team1);
        player3.setTeam(team1);
        player1.print();
        player2.print();
        player3.print();

    }
}
