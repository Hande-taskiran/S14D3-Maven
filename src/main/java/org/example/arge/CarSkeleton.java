package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }
    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the engine is starting";
    }
    public String drive(){
        System.out.println(getClass().getSimpleName());
        runEngine();
        return "the car is driving";
    }
    protected String runEngine(){
        System.out.println(getClass().getSimpleName());
        return "the engine is running";
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
