public class SellPrice {
    public static int surcharge(int purchasePrice) {
        return purchasePrice / 100 * 30;
    }

    public static int sellPrice(int purchasePrice, int surcharge) {
        return purchasePrice + surcharge;
    }
}
