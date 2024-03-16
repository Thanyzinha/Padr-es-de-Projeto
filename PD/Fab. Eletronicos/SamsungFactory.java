public class SamsungFactory implements ElectronicsFactory {
    @Override
    public Smartphone createSmartphone() {
        return new Galaxy();
    }

    @Override
    public Laptop createLaptop() {
        return new SamsungLaptop();
    }
}
