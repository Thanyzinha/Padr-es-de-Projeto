public class Main {
    public static void main(String[] args) {
        EggFactory nestleFactory = new NestleFactory();
        EggFactory garotoFactory = new GarotoFactory();
        EggFactory lactaFactory = new LactaFactory();

        System.out.println("Nestle Products:");
        printEggInfo(nestleFactory, 1);  // Alpino
        printEggInfo(nestleFactory, 2);  // Classic

        System.out.println("Garoto Products:");
        printEggInfo(garotoFactory, 1);  // Crocante
        printEggInfo(garotoFactory, 2);  // Talento

    }

    static void printEggInfo(EggFactory factory, int productCode) {
        Egg egg = factory.createEgg(productCode);
        if (egg != null) {
            System.out.println(egg.getInfo());
        } else {
            System.out.println("Product not found.");
        }
    }
}
