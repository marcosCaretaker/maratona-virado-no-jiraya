package academy.marcoscaretaker.maratonajava.javacore.Csobrecargametodos.pratice.result;

import academy.marcoscaretaker.maratonajava.javacore.Csobrecargametodos.domain.Anime;
import academy.marcoscaretaker.maratonajava.javacore.Csobrecargametodos.pratice.domain.Studio;

public class LojaAnime {
    public static void main(String[] args) {
        Studio studio = new Studio();
        Anime anime = new Anime();

        //studio.init("MAPPA","Japan",2011);
        anime.init("Chainsaw man","TV",12,"Shoenen",studio);
        anime.imprime();
    }
}
