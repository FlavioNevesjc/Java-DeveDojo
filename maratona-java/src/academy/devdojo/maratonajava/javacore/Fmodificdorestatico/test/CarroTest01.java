package academy.devdojo.maratonajava.javacore.Fmodificdorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificdorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);

        Carro c1 = new Carro("Fox",280);
        Carro c2 = new Carro("Palio",275);
        Carro c3 = new Carro("Meriva",290);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
