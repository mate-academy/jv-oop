public class MainApp {
    public static void main(String[] args) {
       Machine big = new Bulldozer();
       Machine rapid = new Truck();
       Machine important = new Excavator();
       big.doWork();
        big.stopWork();
       rapid.doWork();
       rapid.stopWork();
        important.doWork();
        important.stopWork();

}}
