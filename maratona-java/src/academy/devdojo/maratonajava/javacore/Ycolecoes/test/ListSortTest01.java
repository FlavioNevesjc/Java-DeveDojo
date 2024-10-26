package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Attack on titan");
        mangas.add("Naruto");
        mangas.add("Neon Genesis Evangelion");
        mangas.add("Ghost in the Shell");
        mangas.add("Dragon Ball");
        Collections.sort(mangas);
        for (String manga : mangas) {
            System.out.println(manga);
        }

        List<Double> valor = new ArrayList<>();
        valor.add(120.22);
        valor.add(10.2);
        valor.add(100.12);
        valor.add(120.21);
        valor.add(90.2);
        valor.add(20.2);
        System.out.println(valor);
        Collections.sort(valor);
        System.out.println(valor);


    }
}
