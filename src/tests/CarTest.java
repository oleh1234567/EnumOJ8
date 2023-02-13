package tests;

import static tests.Car.*;

public class CarTest {
    public static void main(String[] args) {
        Car car = PremiumCar.MERCEDES;
        car = ChipCar.ZAZ;
        car = MiddleCar.SSANGYONG;

        for (int i = 0; i < 5; i++) {
            for (Cars c : Cars.values()) {
                Car car1 = c.randomSelection();
                System.out.println(car1);
            }
            System.out.println("**********************");
        }
    }
}
