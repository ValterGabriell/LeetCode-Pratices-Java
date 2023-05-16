package org.example.comportamento.CarPredicate;

import org.example.comportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
}
