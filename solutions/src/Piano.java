public class Piano extends Instrument {
    private int buyPrice;
    private int sellPrice;
    private float commission = 0.2F;

    public Piano(int buyPrice, int sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public int profit() {
        return Math.round((sellPrice - buyPrice) * (1 - commission));
    }
}
