package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Flávio Neves");
        Consumidor consumidor2 = new Consumidor("Anthony José");

        Manga manga1 = new Manga(5L,"Attack on titan",9.5);
        Manga manga2 = new Manga(1L,"Naruto",10);
        Manga manga3 = new Manga(9L,"Neon Genesis Evangelion",50.8);
        Manga manga4 = new Manga(2L,"Ghost in the Shell",3.3);
        Manga manga5 = new Manga(3L,"Dragon Ball",30);

        List<Manga> listManga1 = List.of(manga1, manga2, manga3);
        List<Manga> listManga2 = List.of(manga1, manga4, manga5);
        Map<Consumidor, List<Manga>> item = new HashMap<>();
        item.put(consumidor2,listManga1);
        item.put(consumidor1,listManga2);
        
        for (Map.Entry<Consumidor, List<Manga>> entry : item.entrySet()){
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()){
                System.out.println("- " + manga.getNome());
            }
            System.out.println("*****");
        }
    }
}
