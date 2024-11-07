package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One piece", 900), new Anime("Naruto", 50),new Anime("Berserk",100)));
        animeList.sort(animeComparators::compareByEpisodeNonStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodies) -> new Anime(title, episodies);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("Super Campeões", 36));

    }

}
