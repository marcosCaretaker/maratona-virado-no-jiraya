package academy.marcoscaretaker.maratonajava.javacore.Gassociacao.domain;

public class Team {
    private String name;
    private FootballPlayer[] players;

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, FootballPlayer[] players) {
        this.name = name;
        this.players = players;
    }

    public void print() {
        System.out.println("Name of team: " + this.name);
        if (players == null) return;
        for (FootballPlayer player : players) {
            System.out.println("Name of player: " + player.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FootballPlayer[] getPlayers() {
        return players;
    }

    public void setPlayers(FootballPlayer[] players) {
        this.players = players;
    }
}
