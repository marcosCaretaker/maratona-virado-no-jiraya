package academy.marcoscaretaker.maratonajava.javacore.Csobrecargametodos.test;

import academy.marcoscaretaker.maratonajava.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Chainsaw man","TV",8,"Shounen");
        anime.imprime();
    }
}
