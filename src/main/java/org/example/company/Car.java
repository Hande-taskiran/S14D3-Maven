package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
    @Override
    public String toString(){
        return "Car=> name: " +name+ ", cylinders: " +cylinders+ ", engine: " +engine+ ", wheels: " +wheels;
    }
    @Override
    public boolean equals(Object car){
        return ((Car)car).name == name && ((Car)car).cylinders == cylinders;
    }
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }
    public String accelerate(){
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }
    public String brake(){
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }


}
