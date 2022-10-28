import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Provider purchase = new Provider();
        Seller sellPrice = new Seller();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter count box Soda >> ");
        int boxCountSoda = order.boxCountSoda = input.nextInt();
        System.out.print("Enter count box Choco >> ");
        int boxCountChoco = order.boxCountChoco = input.nextInt();
        System.out.print("Enter count in box Soda >> ");
        int thingsInBoxSoda = order.thingsInBoxSoda = input.nextInt();
        System.out.print("Enter count in box Choco >> ");
        int thingsInBoxChoco = order.thingsInBoxChoco = input.nextInt();
        System.out.print("Enter thing count Meet >> ");
        int countMeet = order.thingCountMeet = input.nextInt();
        System.out.print("Enter purchase price per thing meet >> ");
        int pricePerThingMeet = purchase.pricePerThingMeet = input.nextInt();
        System.out.print("Enter purchase price per thing choco >> ");
        int pricePerThingChoco = purchase.pricePerThingChoco = input.nextInt();
        System.out.print("Enter purchase price per thing soda >> ");
        int pricePerThingSoda = purchase.pricePerThingSoda = input.nextInt();

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

        int allSellPrice = sellPrice.fullSellPrice(sellPriceChoco, sellPriceMeat, sellPriceSoda);

        int profit = allSellPrice - allPurchasePrice;

        System.out.println("Sell price Soda = " + sellPriceSoda);
        System.out.println("Sell price Choco = " + sellPriceChoco);
        System.out.println("Sell price Meat = " + sellPriceMeat);
        System.out.println("Things all products = " + thingsAllProducts);
        System.out.println("All purchase price = " + allPurchasePrice);
        System.out.println("All sell price = " + allSellPrice);
        System.out.println("Profit = " + profit);
    }
}