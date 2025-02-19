package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojetos.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojetos.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person pessoa = Person.PersonBuilder
                .builder()
                .firstName("Flávio")
                .lastName("Neves")
                .username("fneves")
                .email("flaviosn@gmail.com")
                .build();
    }
}
