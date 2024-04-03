package academy.devdojo.maratonajava.introducao;
/*
Pratica

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salario>, na data <data>
*/

import java.util.Date;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Flávio";
        String endereco = "Rua 10";
        double salario = 2000;
        String data = "10/12/2022";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco +
                " confirmo que recebi o salário de " + salario + ", na data " + data);
    }
}
