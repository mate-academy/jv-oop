public class MainApp {
    public static void main(String[] args) {
        Machine important = new Excavator();
        important.doWork();
        important.stopWork();
        Machine rapid = new Truck();
        rapid.doWork();
        rapid.stopWork();
        Machine big = new Bulldozer();
        big.doWork();
        big.stopWork();
    }
}
