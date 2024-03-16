public class DellFactory implements ElectronicsFactory {
    @Override
    public Smartphone createSmartphone() {
        return new DellPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new DellLaptop();
    }
}
