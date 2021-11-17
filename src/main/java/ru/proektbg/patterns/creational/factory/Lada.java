package ru.proektbg.patterns.creational.factory;

/**
 * @author Raspopov Anton
 */
public class Lada extends Car{

    protected Lada() {
    }

    @Override
    public void drive() {
        System.out.println("Driving Lada");
    }

    @Override
    public void start() {
        System.out.println("Starting Lada");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Lada");
    }
}
