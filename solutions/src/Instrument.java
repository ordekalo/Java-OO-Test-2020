public abstract class Instrument implements Dif {
    int buyPrice;
    int sellPrice;

    public Instrument(int buyPrice, int sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public abstract int profit();

    @Override
    public int diff(Instrument instrument) {
        return this.profit() - instrument.profit();
    }
}
