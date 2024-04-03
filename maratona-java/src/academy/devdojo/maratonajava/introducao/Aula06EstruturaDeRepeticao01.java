package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        System.out.println("Utilzando While");
        while (count < 10){
            System.out.println(++count);
        }
        System.out.println("Utilizando do While");
        do {
            System.out.println(count++);
        } while (count < 20);
        System.out.println("Utilizando o For");
        for (int i=0; i <10; ++i){
            System.out.println(i);
        }
    }
}
