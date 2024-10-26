package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Flávio Neves");
        Consumidor consumidor2 = new Consumidor("Anthony José");

        Manga manga1 = new Manga(5L,"Attack on titan",9.5);
        Manga manga2 = new Manga(1L,"Naruto",10);
        Manga manga3 = new Manga(9L,"Neon Genesis Evangelion",50.8);
        Manga manga4 = new Manga(2L,"Ghost in the Shell",3.3);
        Manga manga5 = new Manga(3L,"Dragon Ball",30);

        Map<Consumidor, Manga> item = new HashMap<>();
        item.put(consumidor2,manga1);
        item.put(consumidor1,manga2);

        for (Map.Entry<Consumidor, Manga> entry : item.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
