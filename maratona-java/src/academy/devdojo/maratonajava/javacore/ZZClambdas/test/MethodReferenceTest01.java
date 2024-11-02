package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
// Reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One piece", 900), new Anime("Naruto", 50),new Anime("Berserk",100)));
        animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        System.out.println(animeList+"\n*******");
        animeList.sort(Comparator.comparing(Anime::getTitle));
        System.out.println(animeList+"\n*******");
        animeList.sort(AnimeComparators::compareByTitle);
        System.out.println(animeList+"\n*******");
        animeList.sort(AnimeComparators::compareByEpisode);
        System.out.println(animeList+"\n*******");

        System.out.println(animeList);
    }

}
