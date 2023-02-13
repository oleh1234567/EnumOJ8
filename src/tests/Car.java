package tests;

public interface Car {
    enum ChipCar implements Car {
        ZAZ, GEELY, CHERY
    }
    enum MiddleCar implements Car {
        KIA, HYUNDAI, SSANGYONG
    }
    enum PremiumCar implements Car {
        MERCEDES, BMW, PORSCHE, TOYOTA
    }
}


