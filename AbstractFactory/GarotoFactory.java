public class GarotoFactory implements EggFactory {
    @Override
    public Egg createEgg(int productCode) {
        switch (productCode) {
            case 1:
                return new CrocanteEgg();
            case 2:
                return new TalentoEgg();
            case 3:
                return new BatonEgg();
            case 4:
                return new CaribeEgg();
            default:
                return null;
        }
    }
}
