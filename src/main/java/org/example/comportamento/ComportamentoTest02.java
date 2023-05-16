package org.example.comportamento;

import org.example.comportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoTest02 {
    private static List<Car> cars =
            List.of(new Car("green", 2011)
                    , new Car("black", 1998)
                    , new Car("red", 2019));

    public static void main(String[] args) {
        List<Car> greenCars = filterGenerico(cars, car -> car.getColor().equals("green"));
        System.out.println(greenCars);
    }

    private static List<Car> filter(List<? extends Car> cars, Predicate<Car> carPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static <T>List<T> filterGenerico(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
