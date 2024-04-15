package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicializaçã estatico de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicializaçã estatico de Funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicializaçã estatico de Funcionario 2");
    }
    public void imprime(){
        super.imprime();
        System.out.println("Salario: "+this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+ this.nome +" tenho o salario de "+this.salario);
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor  Funcionario");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}