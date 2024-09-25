package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int cylinders;


    public GasPoweredCar(double avgKmPerLitre, int cylinders) {
        this.avgKmPerLiter = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }
    @Override
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the gasoline powered engine is starting";
    }
    @Override
    public String drive(){
        System.out.println(getClass().getSimpleName());
        runEngine();
        return "the gasoline powered car is driving";
    }
}
