package academy.marcoscaretaker.maratonajava.javacore.ZZDoptional.test;

import academy.marcoscaretaker.maratonajava.javacore.ZZDoptional.domain.Manga;
import academy.marcoscaretaker.maratonajava.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Attack on Titan");
        mangaByTitle.ifPresent(m -> m.setTitle("Attack on Titan 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(3)//test 6
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Demon Slayer")
                .orElseGet(() -> new Manga(5, "Demon Slayer", 205));
        System.out.println(newManga);
    }
}
