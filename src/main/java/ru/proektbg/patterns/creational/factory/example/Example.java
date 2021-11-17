package ru.proektbg.patterns.creational.factory.example;

import ru.proektbg.patterns.creational.factory.Car;
import ru.proektbg.patterns.creational.factory.CarFactory;

/**
 * @author Raspopov Anton
 */
public class Example {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car car = factory.buyCar(CarFactory.Style.CHEAP);
        car.start();
        car.drive();
        car.stop();
    }
}
