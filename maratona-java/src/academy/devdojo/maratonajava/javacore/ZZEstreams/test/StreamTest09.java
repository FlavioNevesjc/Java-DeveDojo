package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.lang.reflect.InaccessibleObjectException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(-10,50).filter(n -> n%2 ==0).forEach(a -> System.out.print(a + " "));
        System.out.println();
        IntStream.range(-10,50).filter(n -> n%2 ==0).forEach(a -> System.out.print(a + " "));
        System.out.println();
        Stream.of("Flávio", "Regiane", "Anthony","Teste")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        int num[] = { 1,2,3,4,5,6};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);
        try(Stream<String> lines = Files.lines(Paths.get("/home/flavio/Projetos/Java-DeveDojo/arquivo/novo.txt"))){
            lines.filter(l-> l.contains("Java")).forEach(System.out::println);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
