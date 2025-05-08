package machinepackage;

public class Main {
    public static void main(String[] args) {
        Machine truck = new Truck();
        Machine bulldozer = new Bulldozer();
        Machine excavator = new Excavator();
        truck.doWork();
        truck.stopWork();
        bulldozer.doWork();
        bulldozer.stopWork();
        excavator.doWork();
        excavator.stopWork();
    }
}
