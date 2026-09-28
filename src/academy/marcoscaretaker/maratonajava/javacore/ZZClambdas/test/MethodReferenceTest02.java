package academy.marcoscaretaker.maratonajava.javacore.ZZClambdas.test;

import academy.marcoscaretaker.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.marcoscaretaker.maratonajava.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparator animeComparator = new AnimeComparator();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Jujutsu Kaisen", 59),
                new Anime("Chainsaw man", 12),
                new Anime("Kimetsu no Yaiba", 63),
                new Anime("Shingeki no Kyojin", 94),
                new Anime("One Punch Man", 24)
        ));
        animeList.sort(animeComparator::compareByEpisodesNonStatic);
        System.out.println(animeList    );
    }
}
