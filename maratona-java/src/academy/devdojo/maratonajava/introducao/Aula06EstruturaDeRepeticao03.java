package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao03 {
    public static void main(String[] args) {
        // imprima os primeiros 25 numeros de um dado valor. Por exemplo, 50
        for (int i = 0; i <= 1000; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
