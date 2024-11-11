package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<String> graphicsDesigners = List.of("Flávio", "Anthony", "Regiane", "Arthur", "Matheus");
        List<String> developers = List.of("Mariana", "João Miguel", "Sandro","Onofre");
        List<String> students = List.of("Albina", "Sandra", "Lucas");
        List<List<String>> devdojo = new ArrayList<>();
        devdojo.add(graphicsDesigners);
        devdojo.add(developers);
        devdojo.add(students);
        for (List<String> people : devdojo){
            for(String person : people){
                System.out.println(person);
            }
        }
        System.out.println("***********");
        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
