public class Seller {
    public static int surcharge(int purchasePrice) {
        return purchasePrice / 100 * 30;
    }

    public static int sellPrice(int purchasePrice, int surcharge) {
        return purchasePrice + surcharge;
    }

    public static int fullSellPrice(int firstSellPrice, int secondSellPrice, int thirdSellprice) {
        return firstSellPrice + secondSellPrice + thirdSellprice;
    }
}
