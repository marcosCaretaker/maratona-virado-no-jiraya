package academy.marcoscaretaker.maratonajava.javacore.ZZClambdas.domain;

public class Anime {
    private String tittle;
    private int episodes;

    public Anime(String tittle, int episodes) {
        this.tittle = tittle;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "tittle='" + tittle + '\'' +
                ", episodes=" + episodes +
                '}';
    }

    public String getTittle() {
        return tittle;
    }

    public int getEpisodes() {
        return episodes;
    }
}
