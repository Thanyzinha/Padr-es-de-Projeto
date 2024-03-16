public class Main {
    public static void main(String[] args) {
        VehicleFactory fordFactory = new FordFactory();
        Car fordCar = fordFactory.createCar();
        Motorcycle fordMotorcycle = fordFactory.createMotorcycle();

        fordCar.design();
        fordMotorcycle.design();

        VehicleFactory hondaFactory = new HondaFactory();
        Car hondaCar = hondaFactory.createCar();
        Motorcycle hondaMotorcycle = hondaFactory.createMotorcycle();

        hondaCar.design();
        hondaMotorcycle.design();
    }
}




