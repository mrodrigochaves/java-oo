package edu.mrodrigochaves.exercices.car;

public class ApplicationRunner {
    
    public static void main(String[] args) {
        
        Car car1 = new Car();

        car1.setColor("Blue");
        car1.setModel("Gol G6");
        car1.setTankCapacity(60);

        System.out.println(car1.getColor());
        System.out.println(car1.getModel());
        System.out.println(car1.getTankCapacity());
        System.out.println(car1.totalTankValue(5.84));


        Car car2 = new Car("Red","Tesla Model 3",55);
        
        System.out.println(car2.getColor());
        System.out.println(car2.getModel());
        System.out.println(car2.getTankCapacity());
        System.out.println(car2.totalTankValue(5.84));




    }
}
