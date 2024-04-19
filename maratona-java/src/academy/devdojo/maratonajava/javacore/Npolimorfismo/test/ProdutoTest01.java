package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NC10i7", 1100);
        Tomate tomate = new Tomate("Tomate siciliano", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("*************************");
        CalculadoraImposto.calcularImpostoTomate(tomate);


    }
}
