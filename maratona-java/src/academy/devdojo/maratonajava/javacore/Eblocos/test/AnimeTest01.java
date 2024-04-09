package academy.devdojo.maratonajava.javacore.Eblocos.test;

import academy.devdojo.maratonajava.javacore.Eblocos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
//        Anime anime = new Anime("One Piece");
//        System.out.println(anime.getEpisodios());

        Anime anime = new Anime();
        for(int episodio : anime.getEpisodios()){
            System.out.print(episodio + " ");
        }
    }
}
