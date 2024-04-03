package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // int, double, float, char, byte, short, long, boolean
        int idadeInt = (int) 100000000000L; // exemplo de cast (int) forçar um valor em Float para Int
        long numeroGrande = 2000L;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdade = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Goku";

        System.out.println("A idade é " + idadeInt + " anos");
        System.out.println("Oi meu nome é " + nome);
    }
}
