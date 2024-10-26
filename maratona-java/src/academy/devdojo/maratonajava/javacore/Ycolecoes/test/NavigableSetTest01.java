package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.*;

class SmartPhoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone smartphone, Smartphone t1) {
        return smartphone.getMarca().compareTo(t1.getMarca());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartPhoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123","Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L,"Attack on titan",9.5));
        mangas.add(new Manga(1L,"Naruto",10));
        mangas.add(new Manga(9L,"Yu Yu Hakusho",50.8));
        mangas.add(new Manga(2L,"Ghost in the Shell",3.3));
        mangas.add(new Manga(3L,"Dragon Ball",30));
        mangas.add(new Manga(10L,"Dragon Ball Z",30));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("*************");
        Manga yuyu = new Manga(1L, "Neon Genesis Evangelion", 8);
        System.out.println(mangas.lower(yuyu)); // <
        System.out.println(mangas.floor(yuyu)); // <=
        System.out.println(mangas.higher(yuyu)); // >
        System.out.println(mangas.ceiling(yuyu)); // >=
    }
}
