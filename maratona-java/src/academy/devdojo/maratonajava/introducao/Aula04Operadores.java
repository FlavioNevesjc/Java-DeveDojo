package academy.devdojo.maratonajava.introducao;

import org.w3c.dom.ls.LSOutput;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores + - * /
        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero02+numero01);
        System.out.println(numero02-numero01);
        System.out.println(numero02*numero01);
        System.out.println(numero02/numero01);

        // resto de divisão %
        System.out.println(numero02%numero01);

        // comparação < > <= >= == != (sempre retornam valores booleam
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualQueDez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualQueVinte);
        System.out.println(isDezIgualQueDez);
        System.out.println(isDezDiferenteDeDez);

        // && (AND) || (OR) ! (NOT)
        int idade = 29;
        float salario = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 4612;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca >valorPlaystation;
        System.out.println(isPlaystationCincoCompravel);

        // atribuição de valores = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %=2;
        System.out.println(bonus);

        // incrementador ou decrimentador de 1 em 1;

        int contador = 0;
        contador += 1;
        contador ++; // incrementa depois
        contador --;
        ++contador; // incrementa antes
        --contador;

    }
}
