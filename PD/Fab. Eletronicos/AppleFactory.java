public class AppleFactory implements ElectronicsFactory {
    @Override
    public Smartphone createSmartphone() {
        return new IPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new MacBook();
    }
}
