package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
    @Override
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the hybrid engine is starting";
    }
    @Override
    public String drive(){
        System.out.println(getClass().getSimpleName());
        runEngine();
        return "the hybrid car is driving";
    }
}
