package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        // List nomes = new ArrayList(); // Java 1.4
        List<String> nomes = new ArrayList(); // Java 1.5 >
        List<String> nomes2 = new ArrayList<>();

        nomes.add("Flávio");
        nomes.add("Anthony");
        nomes.add("Regiane");
        nomes2.add("Neves");
        nomes2.add("José");
        nomes2.add("Paiva");

        nomes.addAll(nomes2);
        for (String nome: nomes){
            System.out.println(nome);
        }
        nomes.add("Neves");
        System.out.println("**************");
        for (int i=0; i<nomes.size();i++){
            System.out.println(nomes.get(i));
        }

    }
}
