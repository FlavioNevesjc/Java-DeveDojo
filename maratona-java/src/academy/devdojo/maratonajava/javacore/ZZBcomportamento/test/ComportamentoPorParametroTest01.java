package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(
            new Car("Green", 2011),
            new Car("Black", 1998),
            new Car("Red"  , 2019)
    );

    public static void main(String[] args) {
        System.out.println(filterCarByColor(cars, "Red"));;
        System.out.println("************");
        System.out.println(filterAge(cars, 2015));


    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> listCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                listCars.add(car);
            }
        }
        return listCars;


    }

    private static List<Car> filterAge(List<Car> cars, int year) {
        List<Car> oldCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                oldCars.add(car);
            }
        }
        return oldCars;
    }
}
