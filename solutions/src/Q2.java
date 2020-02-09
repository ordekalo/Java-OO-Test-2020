public class Q2 {
    public static void main(String[] args) {
        Dif p1 = new Piano(20, 30);
        int delta1 = p1.diff(new Piano(20, 24));
        int delta2 = p1.diff(new Piano(30, 40));
        System.out.println("Delta1 is = " + delta1);
        System.out.println("Delta1 is = " + delta2);
    }
}
