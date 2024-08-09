package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        // String são imutaveis
        String nome = "Flavio"; //String constant pool
        String nome2 = "Flavio";
        nome.concat(" Neves"); // Se quiser mudar o valor da variavel nome o correto é fazer isto |  nome = nome.concat(" Neves");

        System.out.println(nome);
        System.out.println(nome == nome2);
        System.out.println(nome.equals(nome2));
        String nome3 = new String("Flavio"); // 1 Variavel de referencia, 2 objeto do tipo string, 3 um string no pool de String
        System.out.println(nome3 == nome2);
        System.out.println(nome3 == nome2.intern());
        System.out.println(nome3.equals(nome2));

    }
}
