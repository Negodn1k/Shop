public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        PurchasePrice purchase = new PurchasePrice();
        SellPrice sellPrice = new SellPrice();

        int boxCountSoda = order.boxCountSoda = 10;
        int boxCountChoco = order.boxCountChoco = 5;
        int thingsInBoxSoda = order.thingsInBoxSoda = 10;
        int thingsInBoxChoco = order.thingsInBoxChoco = 20;
        int countMeet = order.thingCountMeet = 50;
        int pricePerThingMeet = purchase.pricePerThingMeet = 500;
        int pricePerThingChoco = purchase.pricePerThingChoco = 100;
        int pricePerThingSoda = purchase.pricePerThingSoda = 150;

        int thingsChoco = order.thingsBoxes(thingsInBoxChoco, boxCountChoco);
        int thingsSoda = order.thingsBoxes(thingsInBoxSoda, boxCountSoda);

        int thingsAllProducts = order.thingsAllProducts(thingsChoco, thingsSoda, countMeet);

        int purchasePriceChoco = purchase.purchasePrice(pricePerThingChoco, thingsChoco);
        int purchasePriceSoda = purchase.purchasePrice(pricePerThingSoda, thingsSoda);
        int purchasePriceMeat = purchase.purchasePrice(pricePerThingMeet, countMeet);

        int allPurchasePrice = purchase.allPurchasePrice(purchasePriceSoda, purchasePriceChoco, purchasePriceMeat);

        int surchargeChoco = sellPrice.surcharge(purchasePriceChoco);
        int surchargeSoda = sellPrice.surcharge(purchasePriceSoda);
        int surchargeMeat = sellPrice.surcharge(purchasePriceMeat);

        int sellPriceChoco = sellPrice.sellPrice(purchasePriceChoco, surchargeChoco);
        int sellPriceSoda = sellPrice.sellPrice(purchasePriceSoda, surchargeSoda);
        int sellPriceMeat = sellPrice.sellPrice(purchasePriceMeat, surchargeMeat);

        System.out.println("Sell price Soda = " + sellPriceSoda);
        System.out.println("Sell price Choco = " + sellPriceChoco);
        System.out.println("Sell price Meat = " + sellPriceMeat);
        System.out.println("All purchase price = " + allPurchasePrice);
        System.out.println("Things all products = " + thingsAllProducts);
    }
}