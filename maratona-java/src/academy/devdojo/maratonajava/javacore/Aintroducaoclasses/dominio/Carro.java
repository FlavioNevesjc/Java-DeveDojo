package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Carro {
    public String nome;
    public String modelo;
    public short ano;

    @Override
    public String toString() {
        return " nome= " + nome +
                ", modelo=" + modelo +
                ", ano= " + ano ;
    }
}
