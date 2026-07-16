package academy.marcoscaretaker.maratonajava.javacore.Csobrecargametodos.domain;

import academy.marcoscaretaker.maratonajava.javacore.Csobrecargametodos.pratice.domain.Studio;

public class Anime {
    private String title;
    private String type;
    private int episodes;
    private String genre;
    private Studio studio;


    public void init(String title, String type, int episodes){
        this.title = title;
        this.type = type;
        this.episodes = episodes;
    }

    public void init(String title, String type, int episodes, String genre){
        this.init(title, type, episodes);
        this.genre = genre;
    }

    public void init(String title, String type, int episodes, String genre, Studio studio){
        this.init(title,type,episodes,genre);
        this.studio = studio;
    }

    public void imprime() {
        System.out.println("Anime title: " + this.title);
        System.out.println("Type: " + this.type);
        System.out.println("Episodes: " + this.episodes);
        System.out.println("Genre: " + this.genre);
        if(this.studio != null){
            this.studio.print();
        }
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getType() {
        return this.type;
    }

    public int getEpisodes() {
        return this.episodes;
    }

}
