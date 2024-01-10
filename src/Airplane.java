public class Airplane implements Transport{
    private double fuelConsumptionPerHour;
    private double flightTime;

    public Airplane(double fuelConsumptionPerHour, double flightTime) {
        this.fuelConsumptionPerHour = fuelConsumptionPerHour;
        this.flightTime = flightTime;
    }

    @Override
    public double calculateFuelConsumption(double distance) {
        return this.fuelConsumptionPerHour * this.flightTime;
    }

}


