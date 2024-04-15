package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicializaçã estatico de pessoas");
    }

    public void imprime(){
        System.out.println("Nome: "+this.nome +"\nCPF: "+this.cpf+"\nEndereço: "+this.endereco.getRua() +" - "+this.endereco.getCep());
    }

    public Pessoa(String nome){
        System.out.println("Dentro do construturo de pessoa");
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
