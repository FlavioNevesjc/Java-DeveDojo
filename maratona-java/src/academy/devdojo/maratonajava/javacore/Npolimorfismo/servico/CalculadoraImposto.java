package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();

        System.out.println("Produto: "+produto.getNome() +"\nValor "+produto.getValor()+"\nImposto a ser pago: "+imposto);
        if (produto instanceof Tomate) {
            // Outra maneira de realizar
            // System.out.println(((Tomate) produto).getDataValidade());
            //
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());

        }
    }
}
