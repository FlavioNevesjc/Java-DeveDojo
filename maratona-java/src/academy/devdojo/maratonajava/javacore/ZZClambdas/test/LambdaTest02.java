package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Flávio", "Anthony", " Regiane");
        List<Integer> integers = map(strings, s -> s.length());
        List<String> upCases = map(strings, s -> s.toUpperCase());
        System.out.println(integers);
        System.out.println(upCases);
    }

    private static <T, R> List <R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for(T e : list){
            R apply = function.apply(e);
            result.add(apply);
        }
        return result;
    }
}
