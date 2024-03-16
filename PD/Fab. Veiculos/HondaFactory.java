public class HondaFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new HondaCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new HondaMotorcycle();
    }
}
