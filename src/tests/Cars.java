package tests;

import onjava.Enums;

public enum Cars {
    CHIPCAR(Car.ChipCar.class),
    MIDDLECAR(Car.MiddleCar.class),
    PREMIUMCAR(Car.PremiumCar.class);

    private final Car[] values;

    Cars(Class<? extends Car> kind) {
        this.values = kind.getEnumConstants();
    }

    public Car randomSelection(){
        return Enums.random(values);
    }
}
