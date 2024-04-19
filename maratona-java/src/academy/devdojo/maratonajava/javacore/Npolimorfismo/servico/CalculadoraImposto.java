package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador (Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();

        System.out.println("Computador "+computador.getNome() +"\nValor "+computador.getValor()+"\nImposto a ser pago: "+imposto);
    }

    public static void calcularImpostoTomate (Tomate tomate){
        System.out.println("Relatório de imposto do tomate");
        double imposto = tomate.calcularImposto();

        System.out.println("Computador "+tomate.getNome() +"\nValor "+tomate.getValor()+"\nImposto a ser pago: "+imposto);
    }
}
