package ru.proektbg.patterns.creational.factory;

/**
 * @author Raspopov Anton
 */
public class Ferrari extends Car{

    Ferrari() {
    }

    @Override
    public void drive() {
        System.out.println("Driving Ferrari");
    }

    @Override
    public void start() {
        System.out.println("Starting Ferrari");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Ferrari");
    }
}
