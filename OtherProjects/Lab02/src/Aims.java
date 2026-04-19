public class Aims{
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc plant1 = new DigitalVideoDisc("Peashooter", "Offense", "Basic shooting plant", 50, 10.0f);
        anOrder.addDigitalVideoDisc(plant1);

        DigitalVideoDisc plant2 = new DigitalVideoDisc("Sunflower", "Support", "Generates sun over time", 30, 8.5f);
        anOrder.addDigitalVideoDisc(plant2);

        DigitalVideoDisc plant3 = new DigitalVideoDisc("Cherry Bomb", "Explosive", 15.0f);
        anOrder.addDigitalVideoDisc(plant3);

        System.out.println("Total: " + anOrder.totalCost());

        System.out.println("\nRemove test:");
        anOrder.removeDigitalVideoDisc(plant2);

        System.out.println("Total after remove: " + anOrder.totalCost());
    }
}