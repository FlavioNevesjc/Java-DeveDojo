package academy.devdojo.maratonajava.introducao;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprimir o dia da semana, considerando 1 como domingo

        byte dia = 0;
        switch (dia) {
            case 1:{
                System.out.println("Domingo");
                break;
            }
            case 2: {
                System.out.println("Segunda");
                break;
            }
            case 3: {
                System.out.println("Terça");
                break;
            }
            case 4:{
                System.out.println("Quarta");
                break;
            }
            case 5: {
                System.out.println("Quinta");
                break;
            }
            case 6: {
                System.out.println("Sexta");
                break;
            }
            case 7: {
                System.out.println("Sabado");
                break;
            }
            default: {
                System.out.println("Data invalida");
                break;
            }
        }
    }
}
