package homework14;

public class Measure {
    private static long time;

    public static void stamp() {
        time = System.currentTimeMillis();
    }

    public static void print() {
        System.out.println(System.currentTimeMillis() - time);
    }
}
