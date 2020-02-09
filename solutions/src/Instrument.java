public class Instrument implements Dif {
    public int profit() {
        return 0;
    }

    @Override
    public int diff(Instrument instrument) {
        return this.profit() - instrument.profit();
    }
}
