package academy.marcoscaretaker.maratonajava.javacore.ZZClambdas.test;

import academy.marcoscaretaker.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.marcoscaretaker.maratonajava.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Jujutsu Kaisen", 59),
                new Anime("Chainsaw man", 12),
                new Anime("Kimetsu no Yaiba", 63),
                new Anime("Shingeki no Kyojin", 94),
                new Anime("One Punch Man", 24)
        ));
        animeList.sort((a1, a2) -> a1.getTittle().compareTo(a2.getTittle()));
        animeList.sort(AnimeComparator::compareByTitle);
        animeList.sort(AnimeComparator::compareByEpisodes);
        System.out.println(animeList);
    }
}
