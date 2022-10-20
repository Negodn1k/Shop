public class Order {
    int boxCountChoco;
    int thingsInBoxChoco;
    int thingCountMeet;
    int thingsInBoxSoda;
    int boxCountSoda;

    public static int thingsBoxes(int thingsInBox, int boxCount) {
        return thingsInBox * boxCount;
    }

    public static int thingsAllProducts(int thingsMeat, int thingsSoda, int thingsChoco) {
        return thingsMeat + thingsSoda + thingsChoco;
    }
}
