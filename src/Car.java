public class Car implements Transport {
    private double fuelEfficiency;
    private double fuelTankCapacity;

    public Car(double fuelEfficiency, double fuelTankCapacity) {
        this.fuelEfficiency = fuelEfficiency;
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public double calculateFuelConsumption(double distance) {
        return distance / this.fuelEfficiency;
    }
}
