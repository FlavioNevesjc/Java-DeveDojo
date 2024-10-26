package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome = "Flávio";
        String nome2 = new String("Flávio");

        System.out.println(nome.equals(nome2));
        System.out.println(nome == nome2);

        Smartphone s1 = new Smartphone("1abc1", "Iphone");
        Smartphone s2 = new Smartphone("1abc1", "Iphone");

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        s1 = s2;
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);


    }

}
