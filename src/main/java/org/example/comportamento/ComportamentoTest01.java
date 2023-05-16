package org.example.comportamento;

import org.example.comportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoTest01 {
    private static List<Car> cars =
            List.of(new Car("green", 2011)
                    , new Car("black", 1998)
                    , new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println("---");
        System.out.println(filterCarByAge(cars, 2012));
    }

    private static List<Car> filterCarByColor(List<? extends Car> cars, String cor) {
        List<Car> colorCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)) {
                colorCars.add(car);
            }
        }
        return colorCars;
    }

    private static List<Car> filterCarByAge(List<? extends Car> cars, int year) {
        List<Car> yearCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                yearCars.add(car);
            }
        }
        return yearCars;
    }
}
