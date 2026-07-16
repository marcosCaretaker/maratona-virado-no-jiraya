package academy.marcoscaretaker.maratonajava.javacore.Eblocosdeinicializacao.test;

import academy.marcoscaretaker.maratonajava.javacore.Eblocosdeinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Attack on titan");
        Anime anime2 = new Anime();
        for(int episode: anime.getEpisodes()){
            System.out.print(episode+" ");
        }

    }
}
