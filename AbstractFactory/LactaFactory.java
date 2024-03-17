public class LactaFactory implements EggFactory {
    @Override
    public Egg createEgg(int productCode) {
        switch (productCode) {
            case 1:
                return new ALeiteEgg();
            case 2:
                return new OreoEgg();
            case 3:
                return new SonhoDeValsaEgg();
            case 4:
                return new OuroBrancoEgg();
            default:
                return null;
        }
    }
}
