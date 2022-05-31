public class main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long expected = 150;
        long actual = (long) service.calculate(5_000, true);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 50;
        actual = (long) service.calculate(5_000, false);
        System.out.println("2. " + expected + " == ? == " + actual);

    }
}
