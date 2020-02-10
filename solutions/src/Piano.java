public class Piano extends Instrument {
    private float commission = 0.2F;

    public Piano(int buyPrice, int sellPrice) {
        super(buyPrice, sellPrice);
    }

    public int profit() {
        return Math.round((sellPrice - buyPrice) * (1 - commission));
    }
}
