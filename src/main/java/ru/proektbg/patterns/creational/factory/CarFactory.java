package ru.proektbg.patterns.creational.factory;

/**
 * @author Raspopov Anton
 */
public class CarFactory {
    public enum Style {
        COMFORT,
        FAST,
        CHEAP
    }

    public Car buyCar(Style style){
        if (style == Style.COMFORT)
            return new Mercedes();
        else if (style == Style.FAST)
            return new Ferrari();
        else if (style == Style.CHEAP)
            return new Lada();
        else return null;
    }


}
