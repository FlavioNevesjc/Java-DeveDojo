package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortMangaByIdComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga manga, Manga t1) {
        return manga.getId().compareTo(t1.getId());
    }
}


public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Attack on titan",9.5));
        mangas.add(new Manga(1L,"Naruto",10));
        mangas.add(new Manga(9L,"Neon Genesis Evangelion",50.8));
        mangas.add(new Manga(2L,"Ghost in the Shell",3.3));
        mangas.add(new Manga(3L,"Dragon Ball",30));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("*********Nome*");
        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("*******Id***");
        Collections.sort(mangas,new SortMangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
