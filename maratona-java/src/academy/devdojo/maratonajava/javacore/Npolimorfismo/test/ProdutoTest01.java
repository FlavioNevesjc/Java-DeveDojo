package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NC10i7", 1100);
        Tomate tomate = new Tomate("Tomate siciliano", 10);
        Televisao televisao = new Televisao("Samsung 50\" ",5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("*************************");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("*************************");
        CalculadoraImposto.calcularImposto(televisao);

    }
}
