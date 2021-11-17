package ru.proektbg.patterns.creational.factory;

/**
 * @author Raspopov Anton
 */
public class Mercedes extends Car{

    protected Mercedes() {
    }

    @Override
    public void drive() {
        System.out.println("Driving Mercedes");
    }

    @Override
    public void start() {
        System.out.println("Starting Mercedes");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Mercedes");
    }
}
