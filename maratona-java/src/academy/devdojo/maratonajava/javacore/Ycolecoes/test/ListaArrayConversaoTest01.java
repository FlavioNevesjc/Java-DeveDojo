package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(listToArray);
        System.out.println("********");

        List<Integer> arrayToList = Arrays.asList(listToArray);
        arrayToList.set(0,12);
        System.out.println(Arrays.toString(listToArray));
        System.out.println(arrayToList);

        List<Integer> numeroList = new ArrayList<>(Arrays.asList(listToArray));
        numeroList.add(20);
        System.out.println(numeroList);



    }

}
