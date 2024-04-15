package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estatico da super classe é executado quando a jvm carregar classe pai
    // 1 - Bloco de inicialização estatico da sub classe é executado quando a jvm carregar classe filha
    // 2 - Alocado espaço em memoria por objeto da superclasse
    // 3 - Cada atributo de superclasse pai é criado e inicializado com valor default ou o que for passado
    // 4 - Bloco de inicialização da subclasse é executado
    // 5 - Contrutor é executado da superclasse
    // 6 - Alocado espaço em memoria por objeto da subclasse
    // 7 - Cada atributo de subclasse pai é criado e inicializado com valor default ou o que for passado
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9 - Contrutor é executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
