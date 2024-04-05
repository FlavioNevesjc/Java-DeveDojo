package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Flavio");
        funcionario.setIdade(40);
        funcionario.setSalarios(new double []{2000, 2000, 3000});

        funcionario.imprime();
        funcionario.MediaSalario();


    }
}
