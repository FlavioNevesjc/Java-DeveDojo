package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L,"Attack on titan",9.5, 2));
        mangas.add(new Manga(1L,"Naruto",10,3));
        mangas.add(new Manga(9L,"Neon Genesis Evangelion",50.8,1));
        mangas.add(new Manga(2L,"Ghost in the Shell",3.3,6));
        mangas.add(new Manga(3L,"Dragon Ball",30,2));
        mangas.add(new Manga(3L,"Dragon Ball",30,2));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
