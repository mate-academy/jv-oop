package core.basesyntax;

public class MainApp {
    private static Truck truck = new Truck();
    private static Bulldozer bulldozer = new Bulldozer();
    private static Excavator excavator = new Excavator();
    private static Machine [] machines = {truck,bulldozer,excavator};

    public static void main(String[] args) {
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
