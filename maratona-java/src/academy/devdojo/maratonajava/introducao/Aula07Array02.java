package academy.devdojo.maratonajava.introducao;

public class Aula07Array02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double = começa sempre com 0
        // char = '\u0000' ou ' '
        // boolean = false
        // String null


        String [] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        nomes = new String[6];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
