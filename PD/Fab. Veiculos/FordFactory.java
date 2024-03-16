public class FordFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new FordCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new FordMotorcycle();
    }
}
