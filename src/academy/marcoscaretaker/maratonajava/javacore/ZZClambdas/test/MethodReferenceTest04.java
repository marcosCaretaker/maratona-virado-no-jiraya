package academy.marcoscaretaker.maratonajava.javacore.ZZClambdas.test;

import academy.marcoscaretaker.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.marcoscaretaker.maratonajava.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparator> newAnimeComparator = AnimeComparator::new;
        AnimeComparator animeComparator = newAnimeComparator.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Jujutsu Kaisen", 59),
                new Anime("Chainsaw man", 12),
                new Anime("Kimetsu no Yaiba", 63),
                new Anime("Shingeki no Kyojin", 94),
                new Anime("One Punch Man", 24),
                new Anime("One Piece", 1179)
        ));
        animeList.sort(animeComparator::compareByEpisodesNonStatic);
        System.out.println(animeList);

        BiFunction<String,Integer,Anime> animeBiFunction1 = (title,episodes) -> new Anime(title,episodes);
        BiFunction<String,Integer,Anime> animeBiFunction2 = Anime::new;
        Anime naruto = animeBiFunction2.apply("Naruto", 220);
        System.out.println(naruto);
        animeList.add(naruto);
        System.out.println(animeList);
        animeList.sort(animeComparator::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
