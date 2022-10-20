public class PurchasePrice {
    int pricePerThingChoco;
    int pricePerThingSoda;
    int pricePerThingMeet;

    public static int purchasePrice(int pricePerThing, int things) {
        return pricePerThing * things;
    }

    public static int allPurchasePrice(int purchasePriceSoda, int purchasePriceChoco, int purchasePriceMeat) {
        return purchasePriceMeat + purchasePriceChoco + purchasePriceSoda;
    }
}
