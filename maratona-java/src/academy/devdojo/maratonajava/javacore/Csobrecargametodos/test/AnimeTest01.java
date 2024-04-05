package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Tv",12, "Akudama Drive", "Ação");
        //anime.setNome("Akudama Drive");
        //anime.setTipo("TV");
        //anime.setEpisodio(12);
        anime.imprime();
    }
}
