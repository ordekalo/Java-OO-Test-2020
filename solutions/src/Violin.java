public class Violin extends Instrument {
    private int transportCost;

    public Violin(int sellPrice, int buyPrice, int transportCost) {
        super(buyPrice, sellPrice);
        this.transportCost = transportCost;
    }

    public int profit() {
        return sellPrice - buyPrice - transportCost;
    }
}
