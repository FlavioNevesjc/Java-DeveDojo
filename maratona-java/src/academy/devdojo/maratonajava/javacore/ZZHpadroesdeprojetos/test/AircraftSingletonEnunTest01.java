package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojetos.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojetos.dominio.AircraftSingletonEager;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojetos.dominio.AircraftSingletonEnun;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojetos.dominio.AircraftSingletonLazy;

public class AircraftSingletonEnunTest01 {
    public static void main(String[] args) {
         bookSeat("1A");
         bookSeat("1A");
    }


    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEnun.INSTANCE.hashCode());
        AircraftSingletonEnun instance = AircraftSingletonEnun.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}
