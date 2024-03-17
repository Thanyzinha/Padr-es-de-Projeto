public class NestleFactory implements EggFactory {
    @Override
    public Egg createEgg(int productCode) {
        switch (productCode) {
            case 1:
                return new AlpinoEgg();
            case 2:
                return new ClassicEgg();
            case 3:
                return new KitKatEgg();
            case 4:
                return new BisEgg();
            default:
                return null;
        }
    }
}
