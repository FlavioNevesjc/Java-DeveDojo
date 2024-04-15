package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Toyoshisa Shimazu");
        pessoa.setCpf("111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("********************");
        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("222222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(4000.0);
        funcionario.imprime();
    }
}
