package edu.mrodrigochaves.exercices.car;

public class MyCar {

    String color;
    String model;
    int tankCapacity;

    MyCar() {

    }

    MyCar(String color, String model, int tankCapacity) {
        this.color = color;
        this.model = model;
        this.tankCapacity = tankCapacity;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    double totalTankValue(double fuelValue) {
        return tankCapacity * fuelValue;

    }

}
