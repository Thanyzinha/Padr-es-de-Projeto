public class Main {
    public static void main(String[] args) {
        ElectronicsFactory appleFactory = new AppleFactory();
        Smartphone iPhone = appleFactory.createSmartphone();
        Laptop macBook = appleFactory.createLaptop();

        iPhone.design();
        macBook.design();

        ElectronicsFactory samsungFactory = new SamsungFactory();
        Smartphone galaxy = samsungFactory.createSmartphone();
        Laptop samsungLaptop = samsungFactory.createLaptop();

        galaxy.design();
        samsungLaptop.design();

        ElectronicsFactory dellFactory = new DellFactory();
        Smartphone dellPhone = dellFactory.createSmartphone();
        Laptop dellLaptop = dellFactory.createLaptop();

        dellPhone.design();
        dellLaptop.design();
    }
}
