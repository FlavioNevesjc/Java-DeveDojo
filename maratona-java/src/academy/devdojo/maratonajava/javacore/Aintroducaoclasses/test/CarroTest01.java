package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Fox";
        carro1.modelo = "VW";
        carro1.ano = 2015;

        Carro carro2 = new Carro();
        carro2.nome = "Meriva";
        carro2.modelo = "GM";
        carro2.ano = 2008;

    System.out.println(carro1);
    System.out.println("Carro: "+carro2.nome + " | Modelo: "+ carro2.modelo + " | Ano: " + carro2.ano);
    }
}
