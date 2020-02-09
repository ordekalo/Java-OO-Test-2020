public class Q1 {
    public static void main(String[] args) {
        Instrument[] a = {new Piano(20, 30), new Violin(30, 25, 1)};
        for (Instrument instrument : a) {
            System.out.print("[ " + instrument.getClass().getName() + ": " + instrument.profit() + " ] ");
        }
        int total = getTotalProfit(a);
        System.out.println("\nTotal Profit is " + total);
    }

    public static int getTotalProfit(Instrument[] instruments) {
        int sum = 0;
        for (Instrument instrument : instruments) {
            sum += instrument.profit();
        }
        return sum;
    }
}
