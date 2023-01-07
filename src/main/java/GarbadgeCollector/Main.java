package GarbadgeCollector;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.start();
        System.gc();
        long startMemory = Runtime.getRuntime().freeMemory();
        System.out.println("Memory at GC: " + startMemory / 1024 + "K");
        Thread.sleep(10000);
        long endMemory = Runtime.getRuntime().freeMemory();
        System.out.println("Memory after GC: " + endMemory / 1024 + "K");

    }

    private void start() {
        long startMemory = Runtime.getRuntime().freeMemory();
        System.out.println("Memory start: " + startMemory / 1024 + "K");
        for (int i = 0; i < 100; i++) {
            Customer customer = new Customer();
        }
        long endMemory = Runtime.getRuntime().freeMemory();
        System.out.println("Memory end: " + endMemory / 1024 + "K");
    }
}
