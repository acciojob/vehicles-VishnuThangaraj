package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

        Car car = new Car("Tata", 4, 4, 4, true, "Sedan");
        car.move(20, 30);

        assert car.getCurrentSpeed() == 20;

        assert car.getCurrentDirection() == 30;

        car.steer(45);

        assert car.getCurrentDirection() == 75;

        assert car.getCurrentSpeed() == 20;

        car.stop();

        assert car.getCurrentSpeed() == 0;
    }
}