package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios = null;
    private double media = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios != null) {
            for (double salario : salarios) {
                System.out.print(salario + ", ");
            }
        }
    }

    public void MediaSalario(){
        double resultado = 0;
        if (salarios != null){
            for(double salario:salarios){
                resultado +=salario;
            };
            media = resultado/salarios.length;
        } else {
            media = 0;
        }
        System.out.println("\nMedia do salario de "+this.nome + " é : "+ media);
    }
}
