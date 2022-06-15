public class Main {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();

        Machine[] machines = {truck, bulldozer, excavator};
        for(Machine unit: machines) {
            unit.doWork();
            unit.stopWork();
        }
    }
}
