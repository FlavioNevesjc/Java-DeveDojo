package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("O Grande software de previsão do futuro ");
        System.out.println("Digite a sua pergunta e eu responderei sim ou não");
        String pergunta = entrada.nextLine();
        if (pergunta.charAt(0) == ' '){
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}
