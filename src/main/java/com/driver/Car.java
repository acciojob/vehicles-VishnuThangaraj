package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;

        this.currentGear = 1;
    }

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seat) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
        this.gears = gears;
        this.seats = seat;
        this.isManual = isManual;

        this.currentGear = 1;
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        super.move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    // Getters

    public int getWheels() {
        return wheels;
    }

    public String getType() {
        return type;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public int getSeats() {
        return seats;
    }

    //Setters

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setGears(int gears) {
        this.currentGear = gears;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
