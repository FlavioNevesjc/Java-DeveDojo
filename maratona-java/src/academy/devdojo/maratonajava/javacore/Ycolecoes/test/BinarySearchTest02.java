package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Attack on titan",9.5));
        mangas.add(new Manga(1L,"Naruto",10));
        mangas.add(new Manga(9L,"Neon Genesis Evangelion",50.8));
        mangas.add(new Manga(2L,"Ghost in the Shell",3.3));
        mangas.add(new Manga(3L,"Dragon Ball",30));

        //Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(9L,"Neon Genesis Evangelion",50.8);


    }
}
