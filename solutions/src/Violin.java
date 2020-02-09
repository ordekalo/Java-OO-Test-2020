public class Violin extends Instrument {
    private int sellPrice;
    private int buyPrice;
    private int transportCost;

    public Violin(int sellPrice, int buyPrice, int transportCost) {
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.transportCost = transportCost;
    }

    public int profit() {
        return sellPrice - buyPrice - transportCost;
    }
}
