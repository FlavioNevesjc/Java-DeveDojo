package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>();
        mangas.add(new Manga(5L,"Attack on titan",9.5));
        mangas.add(new Manga(1L,"Naruto",10));
        mangas.add(new Manga(9L,"Neon Genesis Evangelion",50.8));
        mangas.add(new Manga(2L,"Ghost in the Shell",3.3));
        mangas.add(new Manga(3L,"Dragon Ball",30));
    }
}
