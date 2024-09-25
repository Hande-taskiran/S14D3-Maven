package org.example.arge;

public class MAin {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CarSkeleton carSkeleton = new CarSkeleton("car", "Base car");

        System.out.println(carSkeleton.startEngine());

        System.out.println(carSkeleton.drive());

        CarSkeleton electric = new ElectricCar("electric", "description", 10.0, 5);

        System.out.println(electric.startEngine());

        System.out.println(electric.drive());

        CarSkeleton hybrid = new HybridCar("hybrid", "description", 10.0, 5, 4);

        System.out.println(hybrid.startEngine());

        System.out.println(hybrid.drive());

        CarSkeleton gasPowered = new GasPoweredCar(10.0, 6 );

        System.out.println(gasPowered.startEngine());

        System.out.println(gasPowered.drive());
    }
}
