package academy.marcoscaretaker.maratonajava.javacore.Gassociacao.domain;

public class FootballPlayer {
    private String name;
    private Team team;

    public FootballPlayer(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Player's Name: " + this.name);
        if (team != null) {
            System.out.println("Team name: " + this.team.getName());
        }
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
