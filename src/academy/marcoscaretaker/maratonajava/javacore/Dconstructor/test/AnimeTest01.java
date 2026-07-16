package academy.marcoscaretaker.maratonajava.javacore.Dconstructor.test;


import academy.marcoscaretaker.maratonajava.javacore.Dconstructor.domain.Anime;
import academy.marcoscaretaker.maratonajava.javacore.Dconstructor.domain.Studio;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Studio studio = new Studio();
        Studio studio2 = new Studio("MAPPA", "Japan", 2011);
        studio.init("Ufotable", "Japan", 2000);
        anime.init("Chainsaw man", "Tv Series", 12, "Dark Fantasy",studio2);
        anime.print();
        System.out.println("=================");
        Anime anime2 = new Anime("Demon Slayer", "Tv Series", 63, "Action", studio);
        anime2.print();
    }
}
