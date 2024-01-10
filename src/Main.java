public class Main {
    public static void main(String[] args) {
        Car car = new Car(8.0, 70.0);
        System.out.println(car.calculateFuelConsumption(200.0));

        Airplane airplane = new Airplane(0.5, 8.0);
        System.out.println(airplane.calculateFuelConsumption(2000.0));

    }
}
